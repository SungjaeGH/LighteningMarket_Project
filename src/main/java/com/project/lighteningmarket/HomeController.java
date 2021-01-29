package com.project.lighteningmarket;

import org.aspectj.weaver.patterns.TypePatternQuestions;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(Model model) {

        model.addAttribute("test", "myTest");

        return "home/home";
    }

/*    @RequestMapping("/login/login")
    public void login( ) {
    }

    @RequestMapping("/product/productRegister")
    public void productsUpload( ) {
    }*/
}
