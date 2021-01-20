package com.project.lighteningmarket.commons.images.persistence;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.SQLException;
import java.util.Map;

public class ImageDAO {

    @Autowired
    private SqlSession query;

    public void saveImage(Map<String, Object> hmap) throws SQLException {
        query.insert("query.saveImage",hmap);
    }
}
