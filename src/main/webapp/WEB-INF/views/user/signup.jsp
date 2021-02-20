<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@include file="../include/head.jsp" %>

<section>
    <%@include file="../include/headbar.jsp" %>
    <!-- Page Content -->
    <div class="container rounded mt-5 mb-5">
        <div class="row d-flex justify-content-center">
            <div class="col-md-6 border-right">
                <form:form modelAttribute="userVO" action="${pageContext.request.contextPath}/user/signup" method="post">
                    <div class="p-7 py-5">
                        <div class="d-flex justify-content-center mb-3">
                            <h4 class="signup-title"><strong>회원가입</strong></h4>
                        </div>
                        <%-- 로그인 정보 --%>
                        <div class="row mt-2">
                            <div class="col-md-12">
                                <label class="labels">아이디</label>
                                <form:input path="id" class="form-control" placeholder="아이디는 영문 또는 숫자 6~10자리로 입력해 주세요" />
                                <span class="error">
                                    <form:errors path="id" />
                                </span>
<%--                                <input type="text" class="form-control" name="id"--%>
<%--                                       placeholder="아이디는 영문 또는 숫자 6~10자리로 입력해 주세요">--%>
                            </div>
                        </div>
                        <div class="row mt-2">
                            <div class="col-md-12">
                                <label class="labels">비밀번호</label>
                                <form:input path="password" class="form-control" placeholder="비밀번호를 입력해 주세요. (8~16자 / 문자, 숫자, 특수문자 혼용)" area-hidden="true"/>
                                <span class="error">
                                    <form:errors path="password" />
                                </span>
                            <%--                                <input type="text" class="form-control" name="password"--%>
<%--                                       placeholder="비밀번호를 입력해 주세요. (8~16자 / 문자, 숫자, 특수문자 혼용)" aria-hidden="true" required>--%>
                            </div>
                        </div>

                        <%-- 회원 정보 --%>
                        <div class="row mt-2">
                            <div class="col-md-12">
                                <label class="labels">이름</label>
                                <form:input path="name" class="form-control" placeholder="실명을 입력해 주세요." />
                                <span class="error">
                                    <form:errors path="name" />
                                </span>
                            <%--                                <input type="text" class="form-control" name="name" placeholder="실명을 입력해 주세요." required>--%>
                            </div>
                        </div>
                        <div class="row mt-2">
                            <div class="col-md-12">
                                <label class="labels">닉네임</label>
                                <form:input path="nickname" class="form-control" placeholder="닉네임을 입력해 주세요." />
                                <span class="error">
                                    <form:errors path="nickname" />
                                </span>
                            <%--                                <input type="text" class="form-control" name="nickname" placeholder="닉네임을 입력해 주세요." required>--%>
                            </div>
                        </div>
                        <div class="row mt-2">
                            <div class="col-md-12">
                                <label class="labels">이메일</label>
                                <form:input path="email" class="form-control" placeholder="이메일을 입력해 주세요." />
                                <span class="error">
                                    <form:errors path="email" />
                                </span>
                            <%--                                <input type="text" class="form-control" name="email" placeholder="이메일을 입력해 주세요." required pattern="[^@]+@[^@]+.[a-zA-Z]{2,6}">--%>
<%-- required pattern="[^@]+@[^@]+.[a-zA-Z]{2,6}" --%>
                            </div>
                        </div>
                        <div class="row mt-2">
                            <div class="col-md-12">
                                <label class="labels">휴대전화번호</label>
                                <form:input path="pNumber" class="form-control" placeholder="휴대폰 번호를 입력해 주세요." />
                                <span class="error">
                                    <form:errors path="pNumber" />
                                </span>
                            <%--                                <input type="text" class="form-control" name="pNumber" placeholder="휴대폰 번호를 입력해 주세요." required>--%>
                            </div>
                        </div>

                        <div class="mt-5 text-center">
                            <button class="btn btn-primary signup-button" type="submit">가입하기</button>
                        </div>
                </form:form>
            </div>
        </div>
    </div>

    <%--          <div class="signup_container">--%>
    <%--            <div class="signup_row">--%>
    <%--              <form action="${path}/user/signup" method="post">--%>

    <%--              </form>--%>
    <%--            </div>--%>
    <%--            <!-- /.row -->--%>
    <%--          </div>--%>

    <!-- /.container -->
</section>
<%@include file="../include/footer.jsp" %>
</html>

<style>

    .form-control:focus {
        box-shadow: none;
        border-color: #BA68C8
    }

    .signup-button {
        background: rgb(99, 39, 120);
        box-shadow: none;
        border: none
    }

    .signup-button:hover {
        background: #682773
    }

    .signup-button:focus {
        background: #682773;
        box-shadow: none
    }

    .signup-button:active {
        background: #682773;
        box-shadow: none
    }

    .labels {
        font-size: 11px
    }

    .error {
        font-size: small;
        color: red !important;

    }

</style>