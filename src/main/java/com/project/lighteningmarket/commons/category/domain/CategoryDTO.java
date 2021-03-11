package com.project.lighteningmarket.commons.category.domain;

public class CategoryDTO {
    String n_key; // 고유키
    String categoryNm; // 카테고리 분류
    String categoryDetailName; // 카테고리 이름
    String navigator; // 네비게이터

    public String getN_key() {
        return n_key;
    }

    public void setN_key(String n_key) {
        this.n_key = n_key;
    }

    public String getCategoryNm() {
        return categoryNm;
    }

    public void setCategoryNm(String categoryNm) {
        this.categoryNm = categoryNm;
    }

    public String getCategoryDetailName() {
        return categoryDetailName;
    }

    public void setCategoryDetailName(String categoryDetailName) {
        this.categoryDetailName = categoryDetailName;
    }

    public String getNavigator() {
        return navigator;
    }

    public void setNavigator(String navigator) {
        this.navigator = navigator;
    }

    @Override
    public String toString() {
        return "CategoryDTO{" +
                "n_key='" + n_key + '\'' +
                ", categoryNm='" + categoryNm + '\'' +
                ", categoryDetailName='" + categoryDetailName + '\'' +
                ", navigator='" + navigator + '\'' +
                '}';
    }
}
