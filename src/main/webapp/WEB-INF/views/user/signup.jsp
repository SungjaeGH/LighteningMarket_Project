<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>회원가입</title>
  <!-- Mobile Specific Metas -->
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <!-- Font-->
  <link rel="stylesheet" type="text/css" href="css/roboto-font.css">
  <link rel="stylesheet" type="text/css" href="fonts/font-awesome-5/css/fontawesome-all.min.css">
  <!-- Main Style Css -->
  <link rel="stylesheet" href="css/style.css"/>
</head>
<body class="form-v5">
<div class="page-content">
  <div class="form-v5-content">
    <form class="form-detail" action="#" method="post">
      <h2>회원가입</h2>
      <%-- 로그인 정보 --%>
      <p class="form-title">로그인 정보</p>
      <div class="find-userinfo regist-info">
        <div class="form-row">
          <label for="_label-id">아이디</label>
          <input type="text" name="_label-id" id="_label-id" class="input-text" placeholder="아이디는 영문 또는 숫자 6~16자리로 입력해 주세요." required>
        </div>
        <div class="form-row">
          <label for="_label-pw">비밀번호</label>
          <input type="text" name="_label-pw" id="_label-pw" class="input-text" placeholder="비밀번호를 입력해 주세요. (8~16자 / 문자, 숫자, 특수문자 혼용)" required>
        </div>
        <div class="form-row">
          <label for="_label-pw-ck">비밀번호 확인</label>
          <input type="text" name="_label-pw-ck" id="_label-pw-ck" class="input-text" placeholder="비밀번호를 확인해 주세요." required>
        </div>
      </div>

      <%-- 회원 정보 --%>
      <p class="form-title">회원 정보</p>
      <div class="find-userinfo regist-customer">
        <div class="form-row">
          <label for="_label-name">이름</label>
          <input type="text" name="_label-name" id="_label-name" class="input-text" placeholder="실명을 입력해 주세요." required>
        </div>
        <div class="form-row">
          <label for="_label-nickname">닉네임</label>
          <input type="text" name="_label-nickname" id="_label-nickname" class="input-text" placeholder="닉네임을 입력해 주세요." required>
        </div>
        <div class="form-row">
          <label for="_label-email">이메일</label>
          <input type="text" name="_label-email" id="_label-email" class="input-text" placeholder="" required pattern="[^@]+@[^@]+.[a-zA-Z]{2,6}">
        </div>
        <div class="form-row">
          <label for="_label-pnumber">휴대전화번호</label>
          <input type="text" name="_label-pnumber" id="_label-pnumber" class="input-text" placeholder="휴대번호를 입력해 주세요." required>
        </div>
      </div>
      <div class="form-row-last">
        <input type="submit" name="register" class="register" value="가입하기">
      </div>
    </form>
  </div>
</div>
</body><!-- This templates was made by Colorlib (https://colorlib.com) -->
</html>

<%--        <div class="form-row">--%>
<%--          <label for="password">비밀번호 확인</label>--%>
<%--          <input type="password" name="password" id="password" class="input-text" placeholder="비밀번호를 확인해 주세요." required pattern="[^@]+@[^@]+.[a-zA-Z]{2,6}">--%>
<%--          <i class="fas fa-lock"></i>--%>
<%--        </div>--%>