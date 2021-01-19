package com.project.lighteningmarket.user.persistence;

import com.project.lighteningmarket.user.domain.LoginDTO;
import com.project.lighteningmarket.user.domain.UserVO;

public interface UserDAO {

    // 회원가입 처리
    void signup(UserVO userVO) throws Exception;

    // 로그인 처리
    UserVO login(LoginDTO loginDTO) throws Exception;
}
