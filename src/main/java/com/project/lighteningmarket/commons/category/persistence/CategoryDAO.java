package com.project.lighteningmarket.commons.category.persistence;

import com.project.lighteningmarket.commons.category.domain.CategoryDTO;
import com.project.lighteningmarket.products.domain.ProductsVO;

import java.util.List;

public interface CategoryDAO {

    public List<CategoryDTO> categoryList() throws Exception;
}
