<%--
  Created by IntelliJ IDEA.
  User: dtc1674
  Date: 2021-01-31
  Time: 오후 4:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<script>
  var dice = "${dice}";
  var email = "${email}";
  console.log(dice);
  console.log(email);

  if (dice !== "NOEMAIL") {
    alert("인증번호를 입력해주세요.");
    self.location = "/login/pwSearch";
  } else if(dice === "NOEMAIL"){
    alert("이메일을 확인해주세요.");
    self.location = "/login/pwSearch";
  }
</script>
</body>
</html>
