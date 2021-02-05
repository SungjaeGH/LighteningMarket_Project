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

                <h2>상품 상세정보</h2>
                <table border="1">
                    <tr>
                        <td>
                            <img src="${path}/images/${vo.productUrl}" width="340" height="300">
                        </td>
                        <td>
                            <table border="1" style="height: 300px; width: 400px;">
                                <tr align="center">
                                    <td>상품명</td>
                                    <td>${vo.productName}</td>
                                </tr>
                                <tr align="center">
                                    <td>가격</td>
                                    <td><fmt:formatNumber value="${vo.productPrice}" pattern="###,###,###"/></td>
                                </tr>
                                <tr align="center">
                                    <td>상품소개</td>
                                    <td>${vo.productDesc}</td>
                                </tr>
                                <tr align="center">
                                    <td colspan="2">
                                        <form name="form1" method="post" action="${path}/shop/cart/insert.do">
                                            <input type="hidden" name="productId" value="${vo.productId}">
                                            <select name="amount">
                                                <c:forEach begin="1" end="10" var="i">
                                                    <option value="${i}">${i}</option>
                                                </c:forEach>
                                            </select>&nbsp;개
                                            <input type="submit" value="장바구니에 담기">
                                        </form>
                                        <a href="${path}/shop/product/list.do">상품목록</a>
                                    </td>
                                </tr>
                            </table>
                        </td>
                    </tr>
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