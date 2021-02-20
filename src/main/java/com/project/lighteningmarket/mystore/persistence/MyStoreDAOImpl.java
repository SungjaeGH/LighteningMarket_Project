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
    public List<ProductVO> product_listAll() throws Exception {

        return sqlSession.selectList(NAMESPACE + ".product_listAll");
    }

    // 찜 테이블 읽기
    @Override
    public List<ProductVO> favorites_listAll() throws Exception {
        return sqlSession.selectList(NAMESPACE + ".favorites_listAll");
    }

    // 이미지 테이블 읽기
    @Override
    public ImagesVO image_read(int imgIdx) throws Exception {
        return sqlSession.selectOne(NAMESPACE + ".image_read", imgIdx);
    }

    // 상점문의 테이블 읽기
    @Override
    public List<StoreQaVO> storeQa_listAll() throws Exception {
        return sqlSession.selectList(NAMESPACE + ".storeQa_listAll");
    }

    // 상점문의 테이블 추가
    @Override
    public void storeQaCreate(StoreQaVO storeQaVO) throws Exception {
        sqlSession.insert(NAMESPACE + ".storeQa_create", storeQaVO);
    }

    // 상점문의 테이블 수정
    @Override
    public void storeQaUpdate(StoreQaVO storeQaVO) throws Exception {
        sqlSession.update(NAMESPACE + ".storeQa_update", storeQaVO);
    }

    // 상점문의 테이블 삭제
    @Override
    public void storeQaDelete(StoreQaVO storeQaVO) throws Exception {
        sqlSession.delete(NAMESPACE + ".storeQa_delete", storeQaVO);
    }

    // 팔로워 테이블 팔로워 아아디 읽기
    @Override
    public  List<FollowerVO> follower_listAll(FollowerVO followerVO) throws Exception {
//       로그인한 아이디
        String sessionValue = followerVO.getLoginId();
        String id = sqlSession.selectOne(NAMESPACE + ".searchId", sessionValue);
        followerVO.setLoginId(id);


        List<FollowerVO> fo = sqlSession.selectList(NAMESPACE + ".follower_listAll", followerVO.getLoginId());
        for(int i = 0; i < fo.size(); i++)
        {
            System.out.println(sqlSession.selectOne(NAMESPACE + ".follower_productCount", fo.get(i).getFollowerNickname()).getClass().getName());
            int a = Integer.parseInt(String.valueOf(sqlSession.selectOne(NAMESPACE + ".follower_productCount", fo.get(i).getFollowerNickname())));
            fo.set(i,followerVO).setFollowerProdutCount(a);
        }
        System.out.println(fo.get(0));

        return fo;
    }
}
