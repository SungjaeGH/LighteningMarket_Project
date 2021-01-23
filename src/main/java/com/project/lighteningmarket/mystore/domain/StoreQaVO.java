package com.project.lighteningmarket.mystore.domain;

public class StoreQaVO {
    private String storeQaIdx; // 상점문의번호
    private String nickname; // 닉네임(member.nickname)
    private String storeQaDes; // 상점문의내용
    private String unknownCheck; // 익명여부

    public String getStoreQaIdx() {
        return storeQaIdx;
    }

    public void setStoreQaIdx(String storeQaIdx) {
        this.storeQaIdx = storeQaIdx;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getStoreQaDes() {
        return storeQaDes;
    }

    public void setStoreQaDes(String storeQaDes) {
        this.storeQaDes = storeQaDes;
    }

    public String getUnknownCheck() {
        return unknownCheck;
    }

    public void setUnknownCheck(String unknownCheck) {
        this.unknownCheck = unknownCheck;
    }

    @Override
    public String toString() {
        return "StoreQaVO{" +
                "storeQaIdx='" + storeQaIdx + '\'' +
                ", nickname='" + nickname + '\'' +
                ", storeQaDes='" + storeQaDes + '\'' +
                ", unknownCheck='" + unknownCheck + '\'' +
                '}';
    }
}
