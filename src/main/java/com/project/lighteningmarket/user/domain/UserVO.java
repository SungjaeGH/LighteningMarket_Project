package com.project.lighteningmarket.user.domain;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Date;

public class UserVO {
    @NotEmpty
    @Size(min = 6, max = 10)
    private String id;

    @NotEmpty
    @Size(min = 8, max = 16)
    // 최소 8~16자, 최소 하나의 문자, 하나의 숫자 및 하나의 특수문자
    @Pattern(regexp="^(?=.*[A-Za-z])(?=.*\\d)(?=.*[$@$!%*#?&~])[A-Za-z\\d$@$!%*#?&~]{8,16}$")
    private String password;

    @NotEmpty
    @Size(min = 2, max = 5)
    private String name;

    @NotEmpty
    @Size(min = 2, max = 10)
    private String nickname;

    @NotEmpty
    @Email
    private String email;

    @NotEmpty
    private String pNumber;

    private Date regDate;
    private String sessionKey;
    private Date sessionLimit;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getpNumber() {
        return pNumber;
    }

    public void setpNumber(String pNumber) {
        this.pNumber = pNumber;
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    public String getSessionKey() {
        return sessionKey;
    }

    public void setSessionKey(String sessionKey) {
        this.sessionKey = sessionKey;
    }

    public Date getSessionLimit() {
        return sessionLimit;
    }

    public void setSessionLimit(Date sessionLimit) {
        this.sessionLimit = sessionLimit;
    }

    @Override
    public String toString() {
        return "UserVO{" +
                "id='" + id + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                ", email='" + email + '\'' +
                ", pNumber='" + pNumber + '\'' +
                ", regDate=" + regDate +
                ", sessionKey='" + sessionKey + '\'' +
                ", sessionLimit=" + sessionLimit +
                '}';
    }
}
