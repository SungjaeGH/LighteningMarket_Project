package com.project.lighteningmarket.user.controller;

import com.project.lighteningmarket.user.domain.UserSearchDTO;
import com.project.lighteningmarket.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.inject.Inject;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.Random;

@Controller
@RequestMapping("/login")
public class UserPwSearchController {

    private final UserService userService;

    @Inject
    public UserPwSearchController(UserService userService) {
        this.userService = userService;
    }

    @Autowired
    private JavaMailSenderImpl mailSender;

    // 비밀번호 찾기 페이지
    @RequestMapping(value = "/pwSearch", method = RequestMethod.GET)
    public String pwSearchGET(@ModelAttribute("UserSearchDTO") UserSearchDTO userSearchDTO) {
        return "login/pwSearch";
    }

    // 비밀번호 찾기 (이메일 발송)
    @RequestMapping(value = "/pwSearch", method = RequestMethod.POST)
    public ModelAndView pwSearchPOST(String id, String email, HttpServletRequest request, HttpServletResponse response) throws Exception {

        Random random = new Random();
        int dice = random.nextInt(157211) + 48271;

        String setfrom = "dtc13579@gmail.com";  // 보내는 사람
        String tomail = request.getParameter("email");  // 받는 사람
        String title = "[번개장터] 비밀번호 찾기 인증 이메일 입니다.";    // 제목
        // 내용
        String content =
                System.getProperty("line.separator") +
                        System.getProperty("line.separator") +
                        "안녕하세요 회원님. 저희 홈페이지를 찾아주셔서 감사합니다." +
                        System.getProperty("line.separator") +
                        System.getProperty("line.separator") +
                        "비밀번호 찾기 인증번호는 " + dice + "입니다." +
                        System.getProperty("line.separator") +
                        System.getProperty("line.separator") +
                        "받으신 인증번호를 홈페이지에 입력해주세요.";

        try {

            MimeMessage message = mailSender.createMimeMessage();
            MimeMessageHelper messageHelper = new MimeMessageHelper(message, true, "UTF-8");

            messageHelper.setFrom(setfrom); // 보내는사람 생략하면 정상작동을 안함
            messageHelper.setTo(tomail); // 받는사람 이메일
            messageHelper.setSubject(title); // 메일제목은 생략이 가능하다
            messageHelper.setText(content); // 메일 내용

            mailSender.send(message);

        } catch (Exception e) {
            System.out.println(e);
        }

        ModelAndView mv = new ModelAndView();    //ModelAndView로 보낼 페이지를 지정하고, 보낼 값을 지정한다.
        mv.setViewName("/member/pass_email");     //인증번호 view
        mv.addObject("dice", dice);
        mv.addObject("email", email);

        System.out.println("mv : " + mv);

        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out_email = response.getWriter();

        out_email.println("<script>alert('이메일이 발송되었습니다. 인증번호를 입력해주세요.');</script>");
        out_email.flush();

        return mv;
    }
}
