<%@ page language="java" contentType="text/html; charset=EUC-KR"
         pageEncoding="EUC-KR"%>
<html>
<head>
    <title>Login</title>
</head>
<body>
<!-- �α��� ��� -->
<div class="container">		<!-- �ϳ��� ���� ���� -->
    <div class="col-lg-4">	<!-- ���� ũ�� -->
        <!-- ����Ʈ���� Ư�� ������, ������ �ε巯���� �ϱ� ���� ū �ڽ� -->
        <div class="jumbotron" style="padding-top: 20px;">
            <form method="post" action="../user/signup.jsp">
                <h3 style="text-align: center;">�α���</h3>
                <div class="form-group">
                    <input type="text" class="form-control" placeholder="���̵�" name="userID" maxlength="20">
                </div>
                <div class="form-group">
                    <input type="password" class="form-control" placeholder="��й�ȣ" name="userPassword" maxlength="20">
                </div>
                <input type="submit" class="btn btn-primary form-control" value="�α���">

                <a href="${path}/user/signup">ȸ������</a>
            </form>
        </div>
    </div>
</div>

</body>
</html>