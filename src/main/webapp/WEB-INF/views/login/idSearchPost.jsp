<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>idSearchPost</title>
</head>
<body>
<script>
    var msg = "${msg}";
    if (msg === "IDSEARCH") {
        alert("아이디는 " + ${id} + " 입니다.");
        self.location = "/login/login";
    } else {
        alert("이메일을 확인해주세요.");
        self.location = "/login/idSearch";
    }
    console.log(msg);
    console.log(id);
</script>
</body>
</html>