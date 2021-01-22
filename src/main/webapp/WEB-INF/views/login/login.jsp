<%@ page language="java" contentType="text/html; charset=EUC-KR"
         pageEncoding="EUC-KR" %>
<html>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<head>
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.6.3/css/all.css"/>
    <style>
        .container {
            border: 2px solid blue;
            text-align: center;

            height: 500px;
            width: 400px;
        }

        body {
            padding: 70px;
        }

        h1 {
            margin: auto;
        }

        .row {
            height: 90px;
            width: 396px;
            background-color: paleturquoise;
        }
    </style>
</head>
<body>
<div class="container">

    <form action="${path}/login/loginPost" method="post">
        <div class="row">
            <h1><i class="fa fa-lock" aria-hidden="true"></i> 로그인</h1>
        </div>
        <br/><br/>

        <div class="input-group">
            <div class="input-group-prepend">
                <span class="input-group-text"><i class="fas fa-user-tie"></i></span>
            </div>
            <input type="text" name="id" class="form-control" placeholder="아이디"/>
        </div>
        <br/>

        <div class="input-group">
            <div class="input-group-prepend">
                <span class="input-group-text"><i class="fa fa-key icon"></i></span>
            </div>
            <input type="Password" name="password" class="form-control" aria-hidden="true" placeholder="비밀번호"/>
        </div>
        <br/>
        <div class="checkbox">
            <label><input type="checkbox" name="useCookie"/> 로그인 유지 </label>
        </div>
        <br/>
        <button type="submit" class="btn btn-primary btn-block"><span class="glyphicon glyphicon-off"></span> 로그인
        </button>
        <br/>
        <br/>
    </form>

    <center>
        <div style="border:1px solid black;height:1px;width:300px;"></div>
    </center>
    <br/>
    <div class="footer">
        <a href="#">ID 찾기</a> |
        <a href="#">비밀번호 찾기</a> |
        <a href="${path}/user/signup">회원가입</a>
    </div>

</div>

<script>

    var msg = "${msg}";
    if (msg === "SIGNEDUP") {
        alert("회원가입이 완료되었습니다. 로그인 해주세요!")
    } else if (msg === "FAILURE") {
        alert("아이디와 비밀번호를 확인해주세요.");
    }

</script>


</body>
</html>