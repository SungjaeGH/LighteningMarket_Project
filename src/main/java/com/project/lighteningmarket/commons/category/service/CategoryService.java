package com.project.lighteningmarket.commons.category.service;

import com.project.lighteningmarket.commons.category.domain.CategoryDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryService {
    // 01. 카테고리 목록 불러오기
    List<CategoryDTO> categoryList() throws Exception;
}