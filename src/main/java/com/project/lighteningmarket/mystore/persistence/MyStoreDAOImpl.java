package com.project.lighteningmarket.mystore.persistence;

import com.project.lighteningmarket.mystore.domain.*;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.springframework.test.context.jdbc.Sql;

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
    public List<ProductVO> product_listAll(ProductVO productVO) throws Exception {
        // 받은 쿠키 세션키값을 이용해 ID찾기
        String sessionValue = productVO.getId();
        String id = sqlSession.selectOne(NAMESPACE + ".searchId", sessionValue);
        productVO.setId(id);


        return sqlSession.selectList(NAMESPACE + ".product_listAll", productVO.getId());
    }

    // 찜 테이블 읽기
    @Override
    public List<ProductVO> favorites_listAll(ProductVO productVO) throws Exception {
        // 받은 쿠키 세션키값을 이용해 ID찾기
        String sessionValue = productVO.getId();
        String id = sqlSession.selectOne(NAMESPACE + ".searchId", sessionValue);
        productVO.setId(id);

        return sqlSession.selectList(NAMESPACE + ".favorites_listAll", productVO.getId());
    }

    // 이미지 테이블 읽기
    @Override
    public ImagesVO image_read(int imgIdx) throws Exception {
        return sqlSession.selectOne(NAMESPACE + ".image_read", imgIdx);
    }

    // 상점문의 테이블 읽기
    @Override
    public List<StoreQaVO> storeQa_listAll(StoreQaVO storeQaVO) throws Exception {
        // 받은 쿠키 세션키값을 이용해 Nickname찾기
        String sessionValue = storeQaVO.getLoginId();
        String nickname = sqlSession.selectOne(NAMESPACE + ".searchNickname", sessionValue);
        storeQaVO.setLoginId(nickname);

        return sqlSession.selectList(NAMESPACE + ".storeQa_listAll", storeQaVO.getLoginId());
    }

    // 상점문의 테이블 추가
    @Override
    public void storeQaCreate(StoreQaVO storeQaVO) throws Exception {
        // 받은 쿠키 세션키값을 이용해 Nickname찾기
        String sessionValue = storeQaVO.getLoginId();
        String nickname = sqlSession.selectOne(NAMESPACE + ".searchNickname", sessionValue);
        storeQaVO.setNickname(nickname);

        System.out.println(storeQaVO);


        sqlSession.insert(NAMESPACE + ".storeQa_create", storeQaVO);
    }


    // 상점문의 테이블 삭제
    @Override
    public void storeQaDelete(StoreQaVO storeQaVO) throws Exception {
        sqlSession.delete(NAMESPACE + ".storeQa_delete", storeQaVO);
    }

    // 팔로워 테이블 팔로워 아아디 읽기
    @Override
    public  List<FollowerVO> follower_listAll(FollowerVO followerVO) throws Exception {
        // 받은 쿠키 세션키값을 이용해 ID찾기
        String sessionValue = followerVO.getLoginId();
        String id = sqlSession.selectOne(NAMESPACE + ".searchId", sessionValue);
        followerVO.setLoginId(id);

        List<FollowerVO> fo = sqlSession.selectList(NAMESPACE + ".follower_listAll", followerVO.getLoginId());
         for(int i = 0; i < fo.size(); i++)
        {
            FollowerVO a = sqlSession.selectOne(NAMESPACE + ".follower_productCount", fo.get(i).getFollowerNickname());
            fo.get(i).setFollowerProdutCount(a.getFollowerProdutCount());
            a = sqlSession.selectOne(NAMESPACE + ".follower_followerCount", fo.get(i).getFollowerNickname());
            fo.get(i).setFollowerCount(a.getFollowerCount());
        }

        return fo;
    }
}
