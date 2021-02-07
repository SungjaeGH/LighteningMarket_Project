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

    // 상점문의 테이블 번호 재정렬
    @Override
    public void storeQaIdxSort(StoreQaVO storeQaVO) throws Exception {
        sqlSession.update(NAMESPACE + ".storeQa_sort", storeQaVO);
    }

}
