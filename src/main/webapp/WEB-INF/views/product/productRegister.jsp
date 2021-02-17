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
<%@include file ="../include/head.jsp" %>

<section>
    <%@include file ="../include/headbar.jsp" %>
    <!-- Page Content -->
    <div class="container">

        <div class="row">

            <%@include file="../include/sidebar.jsp"%>
            <!-- /.col-lg-3 -->

            <div class="col-lg-9">

                </br>

                <h2>상품 등록</h2>
                <form id="form1" name="form1" enctype="multipart/form-data" method="post">
                    <table border="1">
                        <tr>
                            <td colspan="2">상품 제목</td>
                            <td colspan="6"><input type="text" name="productTitle" id="productTitle"></td>
                        </tr>
                        <tr>
                            <td colspan="2">id</td>
                            <td colspan="2" align="center"><input type="text" name="id" id="id"></td>
                            <td colspan="2">가격</td>
                            <td colspan="2" align="center"><input type="text" name="productPrice" id="productPrice"></td>
                        </tr>
                        <tr>
                            <td colspan="2">거래지역</td>
                            <td colspan="2" align="center"><input type="text" name="tradeArea" id="tradeArea"></td>
                            <td colspan="2">상품상태</td>
                            <td colspan="2" align="center"><input type="text" name="statement" id="statement"></td>
                        </tr>
                        <tr>
                            <td colspan="2">수량</td>
                            <td colspan="2"><input type="text" name="count" id="count"></td>
                            <td colspan="2">교환 가능 여부</td>
                            <td colspan="2"><input type="text" name="exchange" id="exchange"></td>
                        </tr>
                        <tr>
                            <td colspan="2">상품설명</td>
                            <td colspan="6" align="center">
                                <textarea rows="5" cols="60" name="description" id="description">
                                </textarea>
                            </td>
                        </tr>
                        <tr>
                            <td colspan="2">상품이미지</td>
                            <td colspan="6"><input type="file" name="productPhoto" id="productPhoto"></td>
                        </tr>
                        <tr>
                            <td colspan="8" align="center">
                                <input type="button" value="등록" id="addBtn">
                                <input type="button" value="목록" id="listBtn">
                            </td>
                        </tr>
                    </table>
                </form>


                </br>
                여기는 타임
                <div>
                    <!-- enctype="multipart/form-data" 파일업로드 필수 옵션 -->
                    <!-- application/x-www-form-urlencoded 기본옵션 -->
                    <form action="/saveImage" enctype="multipart/form-data" method="post">
                        <input type="file" name="imgFile" />
                        <input type="submit" value="이미지저장"/>
                    </form>
                    <!-- form data가 이곳으로 이동 -->

                    <!-- img태그의 src 경로는 byte이미지 가져오는 컨트롤러 호출(/getByteImage) -->
                    <img class = "image_box" alt="" src="/getByteImage" />
                </div>

                <!-- /.row -->

            </div>
            <!-- /.col-lg-9 -->

        </div>
        <!-- /.row -->

    </div>
    <!-- /.container -->
</section>
<script>
    $(document).ready(function(){
        // 상품 등록 유효성검사
        $("#addBtn").click(function(){
            var id = $("#id").val();
            var productTitle = $("#productTitle").val();
            var tradeArea = $("#tradeArea").val();
            var statement = $("#statement").val();
            var exchange = $("#exchange").val();
            var productPrice = $("#productPrice").val();
            var description = $("#description").val();
            var count = $("#count").val();
            var productPhoto = $("#productPhoto").val();

            if(id == "") {
                alert("id를 입력해주세요");
                id.focus();
            } else if (productTitle == "") {
                alert("상품 제목을 입력해주세요");
                productTitle.focus();
            } else if (tradeArea == "") {
                alert("거래 지역을 입력해주세요");
                tradeArea.focus();
            } else if (statement == "") {
                alert("상품 상태를 입력해주세요");
                statement.focus();
            } else if (exchange == "") {
                alert("교환 가능 여부를 입력해주세요");
                exchange.focus();
            } else if (description == "") {
                alert("상품 설명을 입력해주세요");
                description.focus();
            } else if (productPrice == "") {
                alert("상품 가격을 입력해주세요");
                productPrice.focus();
            } else if (count == "") {
                alert("상품 개수를 입력해주세요");
                count.focus();
            } else if (productPhoto == "") {
                alert("이미지를 업로드 해주세요");
                productPhoto.focus();
            }
            // 상품 정보 전송
            document.form1.action = "${path}/product/insert.do";
            document.form1.submit();
        });
        // 상품 목록이동
        $("#listBtn").click(function(){
            location.href='${path}/product/list.do';
        });
    });
</script>
<%@include file="../include/footer.jsp"%>