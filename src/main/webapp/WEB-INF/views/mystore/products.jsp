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
            <!-- /.col-lg-3 -->
            <!-- /.col-lg-9 -->


            <div class="col-lg-9">
                <button type="button" class="btn btn-danger" onClick="location.href='../mystore/products'"> 상품</button>
                <button type="button" class="btn btn-success" onClick="location.href='../mystore/favorites'">찜</button>

                <div class="col-lg-9">
                    <c:forEach items="${products}" var="products">
                        <tr>
                            <td>${products.title}<br/></td>
                            <td>${products.price}</td>
                            <td>${products.regDate}<br/></td>
                        </tr>
                    </c:forEach>
                </div>
            </div>



        </div>
        <!-- /.row -->

    </div>
    <!-- /.container -->
</section>
<%@include file="../include/footer.jsp"%>
</html>