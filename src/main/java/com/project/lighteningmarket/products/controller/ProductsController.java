package com.project.lighteningmarket.products.controller;

import com.project.lighteningmarket.products.domain.ProductsVO;
import com.project.lighteningmarket.products.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("product/*")
public class ProductsController {

    @Autowired
    private ProductsService productService;

    // 1. 상품 전체 목록
    @RequestMapping("/productList")
    public ModelAndView list(ModelAndView mav) throws Exception {
        mav.setViewName("/product/productList");
        mav.addObject("list", productService.listProduct());
        return mav;
    }
    // 2. 상품 상세보기
    @RequestMapping("/detail/{productId}")
    public ModelAndView detail(@PathVariable("productId") int productId, ModelAndView mav) throws Exception {
        mav.setViewName("/product/productDetail");
        mav.addObject("vo", productService.detailProduct(productId));
        return mav;
    }

    // 3. 상품등록 처리 매핑
    @RequestMapping("insert.do")
    public String insert(ProductsVO vo) throws Exception {
        productService.insertProduct(vo);
        return "redirect:/product/productList";
    }
}