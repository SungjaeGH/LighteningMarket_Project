package com.project.lighteningmarket.user.persistence;

import com.project.lighteningmarket.user.domain.LoginDTO;
import com.project.lighteningmarket.user.domain.UserSearchDTO;
import com.project.lighteningmarket.user.domain.UserVO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import javax.inject.Inject;

@Repository
public class UserDAOImpl implements UserDAO {
    private static final String NAMESPACE = "com.project.lighteningmarket.mappers.user.UserMapper";

    private final SqlSession sqlSession;

    @Inject
    public UserDAOImpl(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    // 회원가입 처리
    @Override
    public void signup(UserVO userVO) throws Exception {
        sqlSession.insert(NAMESPACE + ".signup", userVO);
    }

    // 로그인 처리
    @Override
    public UserVO login(LoginDTO loginDTO) throws Exception {
        return sqlSession.selectOne(NAMESPACE + ".login", loginDTO);
    }

    // 아이디 찾기
    @Override
    public UserVO idsearch(UserSearchDTO userSearchDTO) throws Exception {
        return sqlSession.selectOne(NAMESPACE + ".idsearch", userSearchDTO);
    }

    // 비밀번호 찾기 (1. 인증번호 받기)
    @Override
    public UserVO emaildice(UserSearchDTO userSearchDTO) throws Exception {
        return sqlSession.selectOne(NAMESPACE + ".emaildice", userSearchDTO);
    }

    // 비밀번호 찾기
    @Override
    public void pwsearch(UserSearchDTO userSearchDTO) throws Exception {
        sqlSession.update(NAMESPACE + ".pwsearch", userSearchDTO);
    }
}
