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
<button id="custom-login-btn">카카오 로그인</button>

<input type="text" id="pwd" style="width:200px;">
<button id="btn" value="암호화" style="width:200px;" onclick="btnClick();">

    <input type="hidden" id="pass" >

<script>
    const CLIENT_ID = '4f6a3f7fc682f73a86bc75ce8f003791';
    const REDIRECT_URI = 'http://localhost:8080/oauth2/callback';
    const KAKAO_AUTH_URL = 'https://kauth.kakao.com/oauth/authorize?client_id='+CLIENT_ID+'&redirect_uri='+REDIRECT_URI+'&response_type=code&prompt=login';

    document.getElementById('custom-login-btn').addEventListener('click', function() {
        window.open(KAKAO_AUTH_URL, 'KakaoLogin', 'titlebar=1, resizable=1, scrollbars=yes, width=600, height=700');
    });

    function KakaoCallback() {
        const code = new URL(window.location.href).searchParams.get("code");
        const grantType = "authorization_code";


    }

    function completeLogin() {
        location.href='/oauth2/completeLogin';
    }

    function btnClick () {
        let pwd = $("#pwd").val();
        let p = '';
        for (var i = 0; i < pwd.length; i++) {
            p += pwd.charCodeAt(i);
            if (i < pwd.length-1) {
                p += '&'
            }
        }
        alert(encodeURIComponent(pwd));

    }
</script>
</body>
</html>