<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 2021-01-03
  Time: 오후 4:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%@include file ="../include/head.jsp" %>
<section>
    <%@include file ="../include/headbar.jsp" %>
    <!-- Page Content -->
    <div class="container">

        <div class="row">

            <%@include file="../include/sidebar.jsp"%>

            <div class="col-lg-9">
                <button type="button" class="btn btn-danger" onClick="location.href='../mystore/products'"> 상품</button>
                <button type="button" class="btn btn-success" onClick="location.href='../mystore/favorites'">찜</button>
                <button type="button" class="btn btn-info" onClick="location.href='../mystore/storeQa'">상점문의</button>
                <c:forEach items="${products}" var="products">
                    <div class="row">

                        <div class="col-lg-4 col-md-6 mb-4">
                            <div class="card h-100">
                                <a href="${products.proIdx}"><img class="card-img-top" src="http://placehold.it/700x400" alt=""></a>
                                <div class="card-body">
                                    <h4 class="card-title">
                                        <a href="${products.proIdx}">${products.title}</a>
                                    </h4>
                                    <h5>${products.price}</h5>
                                    <p class="card-text">${products.regDate}</p>
                                </div>
                                <div class="card-footer">
                                    <h5>${products.tradeArea}</h5>
                                </div>
                            </div>
                        </div>

                    </div>
                    <!-- /.row -->
                </c:forEach>
            </div>
            <!-- /.col-lg-9 -->

        </div>
        <!-- /.row -->

    </div>
    <!-- /.container -->
</section>
<%@include file="../include/footer.jsp"%>
</html>