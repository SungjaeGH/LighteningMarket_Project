<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<div class="col-lg-3">

    <h1 class="my-4">Shop Name</h1>
    <form id="categoryLink" name="categoryLink" method="post">
    <div class="list-group">
        <a class="list-group-item main" class="list-group-item">옷
            <ul class="sub" style="display:none">
                </br>
                <li class="list-group-item test"><input type="hidden" value="201" name="cateCode">상의</li>
                <li class="list-group-item test"><input type="hidden" value="202" name="cateCode">하의</li>
                <li class="list-group-item test"><input type="hidden" value="203" name="cateCode">신발</li>
            </ul>
        </a>
        <a href="../product/productList" class="list-group-item">동물</a>
        <a href="#" class="list-group-item">음식</a>
    </div>
    </form>

    <script>
        $(".main").click(function(){
            if($(".sub").is(":visible")){
                $(".sub").slideUp();
            }
            else{
                $(".sub").slideDown();
            }
        });

        $(document).ready(function(){
            $(".test").click(function(){
                document.categoryLink.action = "../product/productList";
                document.categoryLink.submit();
            });
        });
    </script>

</div>
