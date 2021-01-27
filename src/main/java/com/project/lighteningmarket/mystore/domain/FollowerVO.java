package com.project.lighteningmarket.mystore.domain;

public class FollowerVO {

    private int followerIdx; // 팔로워 인덱스
    private String fromUser; // 팔로워하는 사람
    private String toUser; // 팔로워 받는 사람

    public int getFollowerIdx() {
        return followerIdx;
    }

    public void setFollowerIdx(int followerIdx) {
        this.followerIdx = followerIdx;
    }

    public String getFromUser() {
        return fromUser;
    }

    public void setFromUser(String fromUser) {
        this.fromUser = fromUser;
    }

    public String getToUser() {
        return toUser;
    }

    public void setToUser(String toUser) {
        this.toUser = toUser;
    }

    @Override
    public String toString() {
        return "FollowerVO{" +
                "followerIdx=" + followerIdx +
                ", fromUser='" + fromUser + '\'' +
                ", toUser='" + toUser + '\'' +
                '}';
    }



}
