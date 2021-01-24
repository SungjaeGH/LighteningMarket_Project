package com.project.lighteningmarket.mystore.domain;

public class StoreReviewVO {
    private String storeReviewIdx;// 상점후기번호
    private String nickname; // 닉네임 (member.nickname)
    private String storeReviewDes; // 내용

    public String getStoreReviewIdx() {
        return storeReviewIdx;
    }

    public void setStoreReviewIdx(String storeReviewIdx) {
        this.storeReviewIdx = storeReviewIdx;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getStoreReviewDes() {
        return storeReviewDes;
    }

    public void setStoreReviewDes(String storeReviewDes) {
        this.storeReviewDes = storeReviewDes;
    }

    @Override
    public String toString() {
        return "StoreReviewVO{" +
                "storeReviewIdx='" + storeReviewIdx + '\'' +
                ", nickname='" + nickname + '\'' +
                ", storeReviewDes='" + storeReviewDes + '\'' +
                '}';
    }
}
