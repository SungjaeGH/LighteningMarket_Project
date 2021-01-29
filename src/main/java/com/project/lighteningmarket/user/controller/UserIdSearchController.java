package com.project.lighteningmarket.user.controller;

import com.project.lighteningmarket.user.domain.LoginDTO;
import com.project.lighteningmarket.user.domain.UserSearchDTO;
import com.project.lighteningmarket.user.domain.UserVO;
import com.project.lighteningmarket.user.service.UserService;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.inject.Inject;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/login")
public class UserIdSearchController {

    private final UserService userService;

    @Inject
    public UserIdSearchController(UserService userService) {
        this.userService = userService;
    }

    // 아이디 찾기 페이지
    @RequestMapping(value = "/idSearch", method = RequestMethod.GET)
    public String idSearchGET(@ModelAttribute("UserSearchDTO") UserSearchDTO userSearchDTO) {
        return "login/idSearch";
    }


    // 아이디 찾기
    @RequestMapping(value = "/idSearchPost", method = RequestMethod.POST)
    public String idsearchPOST(UserSearchDTO userSearchDTO, RedirectAttributes redirectAttributes, Model model) throws Exception {
        System.out.println(userSearchDTO.toString());

        UserVO userVO = userService.idsearch(userSearchDTO);
        System.out.println(userVO);

        if(userVO.getEmail().equals(userSearchDTO.getEmail())) {
            redirectAttributes.addFlashAttribute("msg", "IDSEARCH");
        }

        return "redirect:/login/idSearch";
    }

}
