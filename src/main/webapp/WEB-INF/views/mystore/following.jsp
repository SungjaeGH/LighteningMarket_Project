<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 2021-01-03
  Time: 오후 4:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%@include file="../include/head.jsp" %>
<section>
    <%@include file="../include/headbar.jsp" %>
    <!-- Page Content -->
    <div class="container">

        <div class="row">

            <%@include file="../include/sidebar.jsp" %>
            <%-- col-lg-9 --%>

            <div class="col-lg-9">

                <%--                버튼 처리--%>
                <div id="carouselExampleIndicators" class="carousel slide my-4" data-ride="carousel">
                    <button type="button" class="btn btn-danger" onClick="location.href='../mystore/products'"> 상품
                    </button>
                    <button type="button" class="btn btn-success" onClick="location.href='../mystore/favorites'">찜
                    </button>
                    <button type="button" class="btn btn-info" onClick="location.href='../mystore/storeQa'">상점문의
                    </button>
                    <button type="button" class="btn btn-warning" onClick="location.href='../mystore/storeReview'">상점후기
                    </button>
                    <button type="button" class="btn btn-light" onClick="location.href='../mystore/following'">팔로잉
                    </button>
                    <button type="button" class="btn btn-dark" onClick="location.href='../mystore/follower'">팔로워
                    </button>
                </div>
                    <%--                   리스트 부분--%>
                    <div class="row">
                        <div class="col-4">
                            <c:forEach items="${following}" var="following">
                                <div class="card">
                                    <div class="card-body">
                                        <h4 class="card-title">
                                                ${following.followingNickname}
                                        </h4>
                                        <h5>상품수 ${following.followingProdutCount} | 팔로워
                                            수 ${following.followerCount}</h5>
                                        <button type="submit" id="storeQaInsert" class="w3-button">
                                            <i class="far fa-paper-plane"></i> 팔로우
                                        </button>
                                    </div>
                                </div>
                            </c:forEach>
                        </div>
                        <div class="col-6">
                            <c:forEach items="${following}" var="following">
                                <div class="card">
                                    <div class="card-body">
                                        <h4 class="card-title">
                                            <a href="hi">
                                                <img class="card-img-top" src="../../../resources/upload/img/${following.productUrl}" alt="" height="90px" width="10px">
                                            </a>

                                        </h4>
                                    </div>
                                </div>
                            </c:forEach>
                        </div>
                    </div>
            </div>
            <!-- /.container -->
        </div>
    </div>
</section>
<%@include file="../include/footer.jsp" %>

<script>

</script>
</html>