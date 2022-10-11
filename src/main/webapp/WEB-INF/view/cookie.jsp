<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Frameset//EN" "http://www.w3.org/TR/html4/frameset.dtd">
<html lang="ko">
<head>
    <script src="http://code.jquery.com/jquery-3.5.1.min.js"></script>

    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>Spring Boot Application</title>
    <script type="application/javascript">


        const setCookie = (name, value, expiredays) => {
            var date = new Date();
            date.setDate(date.getDate() + expiredays);
            document.cookie = escape(name) + "=" + escape(value) + "; expires=" + date.toUTCString();
        }

        const closePopup = () => {
                setCookie("popupYN", "N", 1);
                // self.close();
            $("#cookiePop").css("display", "none"); // 이거대신 위에 close
        }

        const getCookie = (name) => {
            var cookie = document.cookie;

            if (document.cookie != "") {
                var cookie_array = cookie.split("; ");
                for ( var index in cookie_array) {
                    var cookie_name = cookie_array[index].split("=");

                    if (cookie_name[0] == name) {
                        return cookie_name[1];
                    }
                }
            }
            return ;
        }

        const openPopup = () => {
            var cookieCheck = getCookie("popupYN");
            if (cookieCheck != "N") {
                if (confirm("첫 구매 감사 쿠폰 도착(하트)")) {
                    if (confirm("다운로드")) {
                        if (confirm("보유쿠폰함 바로가기")) {
                            alert("페이지 이동 하였음.");
                        }
                    }
                    closePopup();
                    return false;
                }

                closePopup();
                return false;
            }
            alert("쿠키 있음");
        }


    </script>
</head>
<body onload="javascript:openPopup()">

안녕하세요.

</body>
</html>
