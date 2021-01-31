package com.project.lighteningmarket.user.service;

import com.project.lighteningmarket.user.domain.LoginDTO;
import com.project.lighteningmarket.user.domain.UserSearchDTO;
import com.project.lighteningmarket.user.domain.UserVO;
import com.project.lighteningmarket.user.persistence.UserDAO;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

@Service
public class UserServiceImpl implements UserService {
    private final UserDAO userDAO;

    @Inject
    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    // 회원 가입 처리
    @Override
    public void signup(UserVO userVO) throws Exception {
        userDAO.signup(userVO);
    }

    // 로그인 처리
    @Override
    public UserVO login(LoginDTO loginDTO) throws Exception {
        return userDAO.login(loginDTO);
    }

    // 아이디 찾기
    @Override
    public UserVO idsearch(UserSearchDTO userSearchDTO) throws Exception {
        return userDAO.idsearch(userSearchDTO);
    }

    // 비밀번호 찾기 (1.인증번호 받기)
    @Override
    public UserVO emaildice(UserSearchDTO userSearchDTO) throws Exception {
        return userDAO.emaildice(userSearchDTO);
    }

    // 비밀번호 찾기
    @Override
    public void pwsearch(UserSearchDTO userSearchDTO) throws Exception {
        userDAO.pwsearch(userSearchDTO);
    }



}