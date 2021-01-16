package com.project.lighteningmarket.user.service;

import com.project.lighteningmarket.user.domain.UserVO;

public interface UserService {

    // 회원 가입 처리
    void signup(UserVO userVO) throws Exception;

}
