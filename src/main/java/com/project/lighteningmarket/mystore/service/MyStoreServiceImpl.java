package com.project.lighteningmarket.mystore.service;

import com.project.lighteningmarket.mystore.domain.*;
import com.project.lighteningmarket.mystore.persistence.MyStoreDAO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    // 찜 테이블 읽기
    @Override
    public List<ProductVO> favorites_listAll() throws Exception {
        return myStoreDAO.favorites_listAll();
    }


    // 이미지 테이블 읽기
    public ImagesVO image_read(int imgIdx) throws Exception {
        return myStoreDAO.image_read(imgIdx);
    }

    // 상점문의 테이블 읽기
    @Override
    public List<StoreQaVO> storeQa_listAll() throws Exception {
        return myStoreDAO.storeQa_listAll();
    }

    // 상점문의 테이블 추가
    @Override
    public void storeQaAddReply(StoreQaVO storeQaVO) throws Exception {
       myStoreDAO.storeQaCreate(storeQaVO);
    }

    // 상점문의 테이블 수정
    @Override
    public void storeQaUpdate(StoreQaVO storeQaVO) throws Exception {
        myStoreDAO.storeQaUpdate(storeQaVO);
    }

    // 상점문의 테이블 삭제
    @Override
    public void storeQaDelete(StoreQaVO storeQaVO) throws Exception {
        myStoreDAO.storeQaDelete(storeQaVO);
    }

    // 상점문의 테이블 번호 재정렬
    @Override
    public void storeQaIdxSort(StoreQaVO storeQaVO) throws Exception {
        myStoreDAO.storeQaIdxSort(storeQaVO);
    }

}
