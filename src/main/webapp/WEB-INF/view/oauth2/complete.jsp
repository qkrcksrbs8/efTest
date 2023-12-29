<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Kakao Login Example</title>
    <script src="https://developers.kakao.com/sdk/js/kakao.js"></script>
    <script src="http://code.jquery.com/jquery-3.5.1.min.js"></script>
</head>
<body>
<h1>로그인 되었습니다</h1>
<button id="complete-login-btn">로그인 완료</button>
<script>
    document.getElementById('complete-login-btn').addEventListener('click', function() {
        opener.parent.completeLogin();
        window.close();
    });
</script>
</body>
</html>