package com.project.lighteningmarket.commons.category.service;

import com.project.lighteningmarket.commons.category.domain.CategoryDTO;
import com.project.lighteningmarket.commons.category.persistence.CategoryDAO;
import com.project.lighteningmarket.products.persistence.ProductsDAO;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CategoryServiceImpl implements CategoryService{

    @Autowired
    private CategoryDAO categoryDAO;

    @Override
    public List<CategoryDTO> categoryList() throws Exception {
        return categoryDAO.categoryList();
    }
}
