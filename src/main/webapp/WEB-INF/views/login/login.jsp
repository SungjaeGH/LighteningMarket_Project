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
            <h1><i class="fa fa-lock" aria-hidden="true"></i> �α���</h1>
        </div>
        <br/><br/>

        <div class="input-group">
            <div class="input-group-prepend">
                <span class="input-group-text"><i class="fas fa-user-tie"></i></span>
            </div>
            <input type="text" name="id" class="form-control" placeholder="���̵�"/>
        </div>
        <br/>

        <div class="input-group">
            <div class="input-group-prepend">
                <span class="input-group-text"><i class="fa fa-key icon"></i></span>
            </div>
            <input type="Password" name="password" class="form-control" aria-hidden="true" placeholder="��й�ȣ"/>
        </div>
        <br/>
        <div class="checkbox">
            <label><input type="checkbox" name="useCookie"/> �α��� ���� </label>
        </div>
        <br/>
        <button type="submit" class="btn btn-primary btn-block"><span class="glyphicon glyphicon-off"></span> �α���
        </button>
        <br/>
        <br/>
    </form>

    <center>
        <div style="border:1px solid black;height:1px;width:300px;"></div>
    </center>
    <br/>
    <div class="footer">
        <a href="#">ID ã��</a> |
        <a href="#">��й�ȣ ã��</a> |
        <a href="${path}/user/signup">ȸ������</a>
    </div>

</div>

<script>

    var msg = "${msg}";
    if (msg === "SIGNEDUP") {
        alert("ȸ�������� �Ϸ�Ǿ����ϴ�. �α��� ���ּ���!")
    } else if (msg === "FAILURE") {
        alert("���̵�� ��й�ȣ�� Ȯ�����ּ���.");
    }

</script>


</body>
</html>