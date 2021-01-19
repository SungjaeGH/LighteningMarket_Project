package com.project.lighteningmarket;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(Model model) {
        model.addAttribute("greeting", "hello world");

        return "home/home";
    }

    @RequestMapping("/login/login")
    public void login( ) {
    }
}
