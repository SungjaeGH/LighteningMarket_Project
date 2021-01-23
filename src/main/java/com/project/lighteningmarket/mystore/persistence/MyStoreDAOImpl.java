package com.project.lighteningmarket.mystore.persistence;

import com.project.lighteningmarket.mystore.domain.*;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import javax.inject.Inject;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class MyStoreDAOImpl implements MyStoreDAO{

    private static final String NAMESPACE = "com.project.lighteningmarket.mappers.mystore.mystoreMapper";

    private final SqlSession sqlSession;

    @Inject
    public MyStoreDAOImpl(SqlSession sqlSession) {this.sqlSession = sqlSession;}

    // 상품 테이블 읽기
    @Override
    public List<ProductVO> product_listAll() throws Exception {
        return sqlSession.selectList(NAMESPACE + ".product_listAll");
    }

/*    @Override
    public ProductVO product_read(Integer proIdx) throws Exception {
        return sqlSession.selectOne(NAMESPACE + ".product_read", proIdx);
    }*/

/*    // 상점문의 테이블 읽기
    @Override
    public ProductQaVO productQa_read(String proQaIdx) throws Exception {
        return sqlSession.selectOne(NAMESPACE + ".productQa_read", proQaIdx);
    }*/

/*    // 상점문의 테이블 내용 넣기
    @Override
    public void productQa_create (ProductQaVO productQaVO) throws Exception {
        sqlSession.insert(NAMESPACE + ".productQa_create", productQaVO);
    }*/

    // 찜 테이블 읽기
    @Override
    public List<FavoritesVO> favorites_listAll() throws Exception {
        return sqlSession.selectList(NAMESPACE + ".favorites_listAll");
    }

/*    // 찜 테이블 삭제 기능
    @Override
    public void favorites_delete (FavoritesVO favoritesVO) throws Exception {
        sqlSession.delete(NAMESPACE + ".favorites_delete", favoritesVO);
    }*/

/*    // 상점후기 테이블 읽기
    @Override
    public StoreReviewVO storeReview_read (String storeReviewIdx) throws Exception {
        return sqlSession.selectOne(NAMESPACE + ".storeReview_read", storeReviewIdx);
    }*/

/*    // 팔로잉 테이블 읽기
    @Override
    public FollowingVO following_read(int followerIdx) throws Exception {
        return sqlSession.selectOne(NAMESPACE + ".following_read", followerIdx);
    }*/

 /*   // 팔로잉 추가 기능
    @Override
    public void following_create (FollowingVO followingVO) throws Exception {
        sqlSession.insert(NAMESPACE + ".following_create", followingVO);
    }*/

/*    // 팔로잉 삭제 기능
    @Override
    public void following_delete (FollowingVO followingVO) throws Exception {
       sqlSession.delete(NAMESPACE + ".following_delete", followingVO);
    }*/

 /*   // 팔로워 테이블 읽기
    public FollowerVO follower_read(int followerIdx) throws Exception {
        return sqlSession.selectOne(NAMESPACE + ".follower_read", followerIdx);
    }*/

    // 이미지 테이블 읽기
    public ImagesVO image_read(int imgIdx) throws Exception {
        return sqlSession.selectOne(NAMESPACE + ".image_read", imgIdx);
    }


}
