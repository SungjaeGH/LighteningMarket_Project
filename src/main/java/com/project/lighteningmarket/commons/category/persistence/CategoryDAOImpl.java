package com.project.lighteningmarket.commons.category.persistence;

import com.project.lighteningmarket.commons.category.domain.CategoryDTO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CategoryDAOImpl implements CategoryDAO{

    private static final String NAMESPACE = "com.project.lighteningmarket.mappers.products.productMapper";

    @Autowired
    private SqlSession sqlSession;

    @Override
    public List<CategoryDTO> categoryList(){
        return sqlSession.selectList(NAMESPACE + ".selectCategory");
    }
}
