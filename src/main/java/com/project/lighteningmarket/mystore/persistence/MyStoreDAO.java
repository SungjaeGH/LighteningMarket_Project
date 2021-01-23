package com.project.lighteningmarket.mystore.persistence;

import com.project.lighteningmarket.mystore.domain.*;

import java.util.List;
public interface MyStoreDAO {

    // 상품 테이블 읽기
    List<ProductVO> product_listAll() throws Exception;

    //ProductVO product_read(Integer proIdx) throws Exception;

    // 상점문의 테이블 읽기
    //ProductQaVO productQa_read(String proQaIdx) throws Exception;

    // 상점문의 테이블 내용 넣기
    //void productQa_create (ProductQaVO productQaVO) throws Exception;

    // 찜 테이블 읽기
    List<ProductVO> favorites_listAll() throws Exception;

    // 찜 테이블 삭제 기능
    //void favorites_delete (FavoritesVO favoritesVO) throws Exception;

    // 상점후기 테이블 읽기
    // StoreReviewVO storeReview_read(String storeReviewIdx) throws Exception;

    // 팔로잉 테이블 읽기
    // FollowingVO following_read(int followerIdx) throws Exception;

    // 팔로잉 추가 기능
    // void following_create (FollowingVO followingVO) throws Exception;

    // 팔로잉 삭제 기능
    // void following_delete (FollowingVO followingVO) throws Exception;

    // 팔로워 테이블 읽기
    // FollowerVO follower_read(int followerIdx) throws Exception;

    // 이미지 테이블 읽기
    ImagesVO image_read(int imgIdx) throws Exception;



}
