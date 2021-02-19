package com.project.lighteningmarket.mystore.persistence;

import com.project.lighteningmarket.mystore.domain.*;

import java.util.List;
public interface MyStoreDAO {

    // 상품 테이블 읽기
    List<ProductVO> product_listAll() throws Exception;

    // 찜 테이블 읽기
    List<ProductVO> favorites_listAll() throws Exception;

    // 이미지 테이블 읽기
    ImagesVO image_read(int imgIdx) throws Exception;

    // 상점문의 테이블 읽기
    List<StoreQaVO> storeQa_listAll() throws Exception;

    // 상점문의 테이블 추가
    void storeQaCreate(StoreQaVO storeQaVO) throws Exception;

    // 상점문의 테이블 수정
    void storeQaUpdate(StoreQaVO storeQaVO) throws Exception;

    // 상점문의 테이블 삭제
    void storeQaDelete(StoreQaVO storeQaVO) throws Exception;

    // 팔로워 테이블 팔로워 아이디 읽기
    List<FollowerVO> follower_listAll() throws Exception;

}
