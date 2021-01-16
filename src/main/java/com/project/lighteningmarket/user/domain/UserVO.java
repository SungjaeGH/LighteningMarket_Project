package com.project.lighteningmarket.user.domain;

import java.util.Date;

public class UserVO {
    private String id;
    private String password;
    private String name;
    private String nickname;
    private String email;
    private String pNumber;
    private Date regDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public String getpassword() {
        return password;
    }

    public void setpassword(String password) {
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



    @Override
    public String toString() {
        return "UserVO{" +
                "id='" + id + '\'' +
                ", nickname='" + nickname + '\'' +
                ", password=" + password +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", pNumber=" + pNumber +
                ", regDate=" + regDate +
                '}';
    }


}
