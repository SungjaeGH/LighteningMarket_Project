package com.project.lighteningmarket.user.controller;

import com.project.lighteningmarket.user.domain.UserSearchDTO;
import com.project.lighteningmarket.user.domain.UserVO;
import com.project.lighteningmarket.user.service.UserService;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public String signupPOST(UserSearchDTO userSearchDTO, RedirectAttributes redirectAttributes) throws Exception {
        userService.idsearch(userSearchDTO);

        return "/login/idSearch";
    }

//    // 아이디 찾기
//    @RequestMapping(value = "/idSearchPost", method = RequestMethod.POST)
//    public String idsearch(UserSearchDTO userSearchDTO, HttpServletResponse response) throws Exception {
//        System.out.println(userSearchDTO.toString());
//
//        UserVO userVO = userService.idsearch(userSearchDTO);
//        System.out.println(userVO);
//        return "/login/idSearchPost";
//    }

}
