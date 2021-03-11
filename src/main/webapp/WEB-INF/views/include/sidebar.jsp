<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<div class="col-lg-3">

    <h1 class="my-4">Shop Name</h1>
    <form id="categoryLink" name="categoryLink" method="POST">
    <div class="list-group">
        <a class="list-group-item main1" class="list-group-item">옷
            <ul class="sub1" style="display:none">
                </br>
                <li class="list-group-item test">
                    <input type="hidden" value="201" id="top" name="top">
                    상의
                </li>
                <li class="list-group-item test">
                    <input type="hidden" value="202" id="bottom" name="bottom">
                    하의
                </li>
                <li class="list-group-item test">
                    <input type="hidden" value="203" id="shoes" name="shoes">
                    신발
                </li>
            </ul>
        </a>
        <a class="list-group-item main2" class="list-group-item">동물
            <ul class="sub2" style="display:none">
                </br>
                <li class="list-group-item test">
                    <input type="hidden" value="201" id="cat" name="top">
                    고양이
                </li>
                <li class="list-group-item test">
                    <input type="hidden" value="202" id="dog" name="bottom">
                    강아지
                </li>
            </ul>
        </a>

        <a class="list-group-item main3" class="list-group-item">음식
            <ul class="sub3" style="display:none">
                </br>
                <li class="list-group-item test">
                    <input type="hidden" value="201" id="snack" name="top">
                    과자
                </li>
                <li class="list-group-item test">
                    <input type="hidden" value="202" id="drink" name="bottom">
                    음료
                </li>
            </ul>
        </a>
    </div>
    </form>


    <form id="categoryTest" name="categoryLinkTest" method="POST">
        <select value="0" selected>
            <option> -- </option>
            <option>상의</option>
            <option>하의</option>
            <option>신발</option>
        </select>
        <select>
            <option> -- </option>
            <option>고양이</option>
            <option>강아지</option>
        </select>
        <select>
            <option> -- </option>
            <option>과자</option>
            <option>음료</option>
        </select>
    </form>



    <script>
        $(".main1").click(function(){
            if($(".sub1").is(":visible")){
                $(".sub1").slideUp();
            }
            else{
                $(".sub1").slideDown();
            }
        });

        $(".main2").click(function(){
            if($(".sub2").is(":visible")){
                $(".sub2").slideUp();
            }
            else{
                $(".sub2").slideDown();
            }
        });

        $(".main3").click(function(){
            if($(".sub3").is(":visible")){
                $(".sub3").slideUp();
            }
            else{
                $(".sub3").slideDown();
            }
        });

        $(document).ready(function(){
            $(".test").click(function(){
                document.categoryLink.action = "../product/productList";
                document.categoryLink.setAttribute("cateCode", $(this).attr("value"))
                document.categoryLink.submit();
            });
        });
    </script>

</div>
