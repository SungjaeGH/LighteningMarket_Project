<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 2021-01-03
  Time: 오후 4:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file ="../include/headtest.jsp" %>
<style>
    .fileDrop {
        width:600px;
        height: 200px;
        border: 1px dotted blue;
    }

    small {
        margin-left: 3px;
        font-weight: bold;
        color: gray;
    }
</style>
</head>
<section>
    <%@include file ="../include/headbar.jsp" %>
    <!-- Page Content -->
    <div class="container">

        <div class="row">

            <%@include file="../include/sidebar.jsp"%>
            <!-- /.col-lg-3 -->
            <div class="col-lg-9">

                <h2>상품목록</h2>
                <table border="1">
                    <tr>
                        <th>상품ID번호</th>
                        <th>상품이미지</th>
                        <th>상품명</th>
                        <th>가격</th>
                    </tr>
                    <c:forEach var="row" items="${list}">
                        <tr>
                            <td>
                                    ${row.productId}
                            </td>
                            <td>
                                <a href="${path}/shop/product/detail/${row.productId}">
                                    <img src="${path}/images/${row.productUrl}" width="120ox" height="110px">
                                </a>
                            </td>
                            <td>
                                <a href="${path}/shop/product/detail/${row.productId}">${row.productName}</a>
                            </td>
                            <td>
                                <fmt:formatNumber value="${row.productPrice}" pattern="###,###,###"/>
                            </td>
                        </tr>
                    </c:forEach>
                </table>

                <!-- /.row -->

            </div>
            <!-- /.col-lg-9 -->

        </div>
        <!-- /.row -->

    </div>
    <!-- /.container -->
</section>

<%@include file="../include/footer.jsp"%>