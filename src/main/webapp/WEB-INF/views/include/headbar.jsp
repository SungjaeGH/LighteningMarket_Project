<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
        <div class="container">
            <a class="navbar-brand" href="#">Start Bootstrap</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarResponsive">
                <ul class="navbar-nav ml-auto">
                    <li class="nav-item active">
                        <a class="nav-link" href="../home/home.jsp">Home
                            <span class="sr-only">(current)</span>
                        </a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">About</a>
                    </li>
                    <li class="nav-item">
                        <c:if test="${not empty login}">
                            <a class="nav-link" href="../product/productRegister">상품 등록</a>
                        </c:if>
                        <c:if test="${empty login}">
                            <a class="nav-link" href="../login/login">상품 등록</a>
                        </c:if>
                    </li>
                    <li class="nav-item">
                        <c:if test="${not empty login}">
                            <a class="nav-link" href="../login/logout">로그아웃</a>
                        </c:if>
                        <c:if test="${empty login}">
                            <a class="nav-link" href="../login/login">로그인</a>
                        </c:if>
                    </li>
                </ul>
            </div>
        </div>
    </nav>