<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="../include/head.jsp" %>

<section
    <%@include file="../include/headbar.jsp" %>
    <!-- Page Content -->
    <div class="login_container">
        <div class="login_row">
            <form action="${path}/login/idSearchPost" method="post">
                <div class="login_title_row">
                    <h1 class="login_title"><i class="fa fa-lock" aria-hidden="true"></i>아이디 찾기</h1>
                </div>
                <br/><br/>

                <div class="input-group">
                    <div class="input-group-prepend">
                        <span class="input-group-text"><i class="fas fa-user-tie"></i></span>
                    </div>
                    <input type="text" name="name" class="form-control" placeholder="이름"/>
                </div>
                <br/>

                <div class="input-group">
                    <div class="input-group-prepend">
                        <span class="input-group-text"><i class="fa fa-key icon"></i></span>
                    </div>
                    <input type="text" name="email" class="form-control" aria-hidden="true"
                           placeholder="이메일"/>
                </div>
                <br/>
                <button type="submit" class="btn btn-primary btn-block"><span
                        class="glyphicon glyphicon-off"></span> 아이디 찾기
                </button>
                <br/>
            </form>
            <center>
                <div style="border:1px solid black;height:1px;width:295px;"></div>
            </center>
            <br/>
            <div class="login_footer">
                <a href="#">비밀번호 찾기</a>
            </div>

        </div>
        <!-- /.row -->
    </div>

    <!-- /.container -->
</section>
<%@include file="../include/footer.jsp" %>

<script>

    var msg = "${msg}";
    if (msg === "IDSEARCH") {
        alert("회원가입이 완료되었습니다. 로그인 해주세요!")
    } else if (msg === "FAILURE") {
        alert("아이디와 비밀번호를 확인해주세요.");
    }

</script>

</html>