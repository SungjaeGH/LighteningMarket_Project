package com.project.lighteningmarket.user.controller;

import com.project.lighteningmarket.user.domain.LoginDTO;
import com.project.lighteningmarket.user.domain.UserVO;
import com.project.lighteningmarket.user.service.UserService;
import org.mindrot.jbcrypt.BCrypt;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/login")
public class UserLoginController {

    private final UserService userService;

    @Inject
    public UserLoginController(UserService userService) {
        this.userService = userService;
    }

    // 로그인 페이지
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginGET(@ModelAttribute("loginDTO")LoginDTO loginDTO) {
        return "/login/login";
    }

    // 로그인 처리
    @RequestMapping(value = "/loginPost", method = RequestMethod.POST)
    public void loginPOST(LoginDTO loginDTO, HttpSession httpSession, Model model) throws Exception {

        UserVO userVO = userService.login(loginDTO);

        if(userVO == null || !BCrypt.checkpw(loginDTO.getPassword(), userVO.getPassword())) {
            return;
        }

        model.addAttribute("user", userVO);

    }
}
