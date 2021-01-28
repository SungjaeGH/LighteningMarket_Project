/*
package com.project.lighteningmarket.commons.images.controller;

import com.project.lighteningmarket.commons.images.domain.ImageDTO;
import com.project.lighteningmarket.commons.images.persistence.ImageDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.HashMap;
import java.util.Map;


@Controller
public class ImageController {

    private ImageDAO dao;

    /**
     * 파일태그를 위한 폼태그
     * @return
     */
    @RequestMapping(value="/home/home")
    public String formFile() {
        return "/home/home";
    }

    /**
     * 파일처리 컨트롤러
     * @param imageDTO
     * @return
     */
    @RequestMapping(value="/saveImage", method = RequestMethod.POST)
    public String saveImage(ImageDTO imageDTO) {
        try {
            Map<String, Object> hmap = new HashMap<String, Object>();
            hmap.put("img", imageDTO.getImgFile().getBytes());
            dao.saveImage(hmap);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:/home/home";
    }


}
*/
