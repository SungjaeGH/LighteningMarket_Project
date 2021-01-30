package com.project.lighteningmarket.mystore.controller;

import com.project.lighteningmarket.mystore.service.MyStoreService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import com.project.lighteningmarket.mystore.domain.*;

import javax.inject.Inject;

@Controller
@RequestMapping("/mystore")
public class MyStoreController {

    private static final Logger logger = LoggerFactory.getLogger(MyStoreController.class);

    private final MyStoreService mystoreservice;

    @Inject
    public MyStoreController(MyStoreService mystoreservice) {this.mystoreservice = mystoreservice;}

    // 상품 페이지로 이동
    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public String productGET(Model model) throws Exception {

        model.addAttribute("products", mystoreservice.product_listAll()); // 상품 테이블 읽기

        return "/mystore/products";
    }

    // 찜 페이지로 이동
    @RequestMapping(value = "/favorites", method = RequestMethod.GET)
    public String FavoritesGET(Model model) throws Exception {

        model.addAttribute("products", mystoreservice.favorites_listAll()); // 상품 테이블 읽기

        return "/mystore/favorites";
    }

    // 상점문의 페이지로 이동
    @RequestMapping(value = "/storeQa", method = RequestMethod.GET)
    public String storeQaGET(Model model) throws Exception {

        model.addAttribute("storeQa", mystoreservice.storeQa_listAll()); // 상품 테이블 읽기

        return "/mystore/storeQa";
    }

}
