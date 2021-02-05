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

                </div>

                <%--                    상점문의 댓글 쓰기--%>
                <div class="row">
                    <form class="form-detail" action="${path}/mystore/storeQaInsert" method="post">
                    <div class="col-lg-12">
                        <div class="box box-primary">
                            <div class="box-header with-border">
                                <h3 class="box-title">상점 문의</h3>
                            </div>
                            <div class="box-body">
                                <div class="form-group">
                                    <input type="text" name="storeQaDes" id="_label-storeQaDes" class="input-text" placeholder="상점문의 입력" required>
                                </div>
                                <div class="fa-pull-right">
                                    <input type='checkbox' id = "unknown"  name='_label-unknownCheck' class="input-checkbox" onclick="function click() {}" />익명
                                    <button type="submit" id="storeQaInsert" class="btn btn-primary">
                                        <i class="fa fa-pen-square"></i> 등록
                                    </button>
                                </div>
                            </div>
                        </div>
                    </div>
                    </form>
                </div>

                    <%--                    상점문의 댓글 목록 및 삭제--%>
                    <div class="row">
                        <form class="form-detail" action="${path}/mystore/storeQaDelete" method="post">
                        <div class="col-lg-12">
                            <div class="box box-primary">
                                <c:forEach items="${storeQa}" var="storeQa">
                                    <div class="box-header with-border">
                                        <input type="hidden" name="storeQaIdx" id="_label-storeQaIdx" class="input-text" value="${storeQa.storeQaIdx}" />
                                        <c:if test="${storeQa.unknownCheck eq 'Y'}">
                                            <h5 class="box-title" >익명</h5>
                                        </c:if>
                                        <c:if test="${storeQa.unknownCheck eq 'N'}">
                                            <h5 class="box-title">${storeQa.nickname}</h5>
                                        </c:if>
                                        <h5 class="box-title">${storeQa.storeQaDes}</h5>
                                        <button type="submit" id="storeQaDelete" class="btn btn-danger">
                                            삭제
                                        </button>
                                        <h5 class="box-title"></h5>
                                    </div>
                                </c:forEach>
                            </div>
                        </div>
                        </form>
                    </div>
            </div>


        </div>
        <!-- /.row -->

    </div>
    <!-- /.container -->
</section>
<%@include file="../include/footer.jsp" %>

<script>
    var unknown_check; // 익명체크 여부
<%--    등록 버튼 이벤트 처리--%>
    $("#replyAddBtn").click(function () {
        if ($("#unknown").is(":checked")) {
            unknown_check = 'Y';
            alert(unknown_check);
            return 'Y';
        } else {
            unknown_check = 'N';
            alert(unknown_check);
            return 'N';
        }
    });
</script>

<%--    // 댓글 등록 이벤트 처리
    $("#replyAddBtn").on("click", function () {
        if (chk)
        {
            alert("댓글 등록 완료!");
        }
        else (!chk)
        {
            console.log(chk);
            alert("댓글 등록 실패!");
        }
/*        var replyText = $("#newReplyText");--%>
<%--        var replyWriter = 'sdfqwe';

        var replyTextVal = replyText.val();
        var replyWriterVal = replyWriter.val();

        $.ajax({
            type : "post",
            url : "'../mystore/storeQaInsert'",
            headers : {
                "Content-type" : "application/json",
                "X-HTTP-Method-Override" : "POST"
            },
            dataType : "text",
            data : JSON.stringify({
                storeQaIdx : storeQaIdx,
                replyText : replyTextVal,
                replyWriter : replyWriterVal
            }),
            success : function (result) {
                if (result == "regSuccess") {
                    alert("댓글 등록 완료!");
                }
                //getReplies();
                getRepliesPaging(replyPageNum);
                replyText.val("");
                replyWriter.val("");
            }
        });*/
    });


    // 댓글 삭제 버튼 이벤트 처리
    $("#replyDeleteBtn").on("click", function () {
        alert("댓글을 삭제하였습니다.");
    });--%>
</html>