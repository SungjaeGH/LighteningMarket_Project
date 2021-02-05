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

                <div id="carouselExampleIndicators" class="carousel slide my-4" data-ride="carousel">
                    <ol class="carousel-indicators">
                        <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
                        <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
                        <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
                    </ol>
                    <div class="carousel-inner" role="listbox">
                        <div class="carousel-item active">
                            <img class="d-block img-fluid" src="http://placehold.it/900x350" alt="First slide">
                        </div>
                        <div class="carousel-item">
                            <img class="d-block img-fluid" src="http://placehold.it/900x350" alt="Second slide">
                        </div>
                        <div class="carousel-item">
                            <img class="d-block img-fluid" src="http://placehold.it/900x350" alt="Third slide">
                        </div>
                    </div>
                    <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
                        <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                        <span class="sr-only">Previous</span>
                    </a>
                    <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
                        <span class="carousel-control-next-icon" aria-hidden="true"></span>
                        <span class="sr-only">Next</span>
                    </a>
                </div>

                <h2>상품 등록</h2>
                <form id="form1" name="form1" enctype="multipart/form-data" method="post">
                    <table border="1">
                        <tr>
                            <td>상품명</td>
                            <td><input type="text" name="productName" id="productName"></td>
                        </tr>
                        <tr>
                            <td>가격</td>
                            <td><input type="text" name="productPrice" id="productPrice"></td>
                        </tr>
                        <tr>
                            <td>상품설명</td>
                            <td><textarea rows="5" cols="60" name="productDesc" id="productDesc"></textarea></td>
                        </tr>
                        <tr>
                            <td>상품이미지</td>
                            <td><input type="file" name="productPhoto" id="productPhoto"></td>
                        </tr>
                        <tr>
                            <td colspan="2" align="center">
                                <input type="button" value="등록" id="addBtn">
                                <input type="button" value="목록" id="listBtn">
                            </td>
                        </tr>
                    </table>
                </form>

                <div>
                    <!-- enctype="multipart/form-data" 파일업로드 필수 옵션 -->
                    <!-- application/x-www-form-urlencoded 기본옵션 -->
                    <form action="/saveImage" enctype="multipart/form-data" method="post">
                        <input type="file" name="imgFile" />
                        <input type="submit" value="이미지저장"/>
                    </form>
                    <!-- form data가 이곳으로 이동 -->

                    <!-- img태그의 src 경로는 byte이미지 가져오는 컨트롤러 호출(/getByteImage) -->
                    <img alt="" src="/getByteImage" />

                    <iframe name="iframePhoto"></iframe>
                    <!-- iframe 적용 존-->
                    <script>

                        function addFilePath(msg){
                            console.log(msg); // 파일명 콘솔 출력
                            document.getElementById("form1").reset(); // ifream에 업로드결과를 출력 후 form에 저장된 데이터 초기화
                        }
                    </script>
                </div>

                <!-- /.row -->

            </div>
            <!-- /.col-lg-9 -->

        </div>
        <!-- /.row -->

    </div>
    <!-- /.container -->
</section>
<%@include file="../include/footer.jsp"%>