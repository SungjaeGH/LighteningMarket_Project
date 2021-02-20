package com.project.lighteningmarket.user.controller;

import com.project.lighteningmarket.user.domain.UserVO;
import com.project.lighteningmarket.user.service.UserService;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.inject.Inject;
import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserSignupController {

    private final UserService userService;

    @Inject
    public UserSignupController(UserService userService) {
        this.userService = userService;
    }

    // 회원가입 페이지
    @RequestMapping(value = "/signup", method = RequestMethod.GET)
    public String signupGET(@ModelAttribute UserVO userVO) throws Exception {
        return "/user/signup";
    }

    // 회원가입 처리
    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public String signupPOST(@ModelAttribute("userVO") @Valid UserVO userVO, BindingResult result, RedirectAttributes redirectAttributes) throws Exception {

        // 유효성 검사
        if(result.hasErrors()) {
            // 에러를 List로 저장
            List<ObjectError> list = result.getAllErrors();
            for(ObjectError error : list) {
                System.out.println(error);
            }
            return "/user/signup";
        }

        String hashedPw = BCrypt.hashpw(userVO.getPassword(), BCrypt.gensalt());
        userVO.setPassword(hashedPw);
        userService.signup(userVO);
        redirectAttributes.addFlashAttribute("msg", "SIGNEDUP");

        return "redirect:/login/login";
    }
}
