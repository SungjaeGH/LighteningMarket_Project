package com.project.lighteningmarket.mystore.service;

import com.project.lighteningmarket.mystore.domain.*;
import com.project.lighteningmarket.mystore.persistence.MyStoreDAO;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Service
public class MyStoreServiceImpl implements MyStoreService{
    private final MyStoreDAO myStoreDAO;

    @Inject
    public MyStoreServiceImpl(MyStoreDAO myStoreDAO) {this.myStoreDAO = myStoreDAO;}

    // 상품 테이블 읽기
    @Override
    public List<ProductVO> product_listAll() throws Exception {
        return myStoreDAO.product_listAll();
    }

    // 상품 테이블 읽기
    @Override
    public List<FavoritesVO> favorites_listAll() throws Exception {
        return myStoreDAO.favorites_listAll();
    }

   /* @Override
    public Object product_read(Integer proIdx) throws Exception {
       myStoreDAO.product_read(proIdx);
        return null;
    }*/

    // 이미지 테이블 읽기
    public ImagesVO image_read(int imgIdx) throws Exception {
        return myStoreDAO.image_read(imgIdx);
    }
}
