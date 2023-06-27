<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Frameset//EN" "http://www.w3.org/TR/html4/frameset.dtd">
<html lang="ko">
<head>
    <script src="http://code.jquery.com/jquery-3.5.1.min.js"></script>

    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>Spring Boot Application</title>
    <script type="application/javascript">

        $(function(){
            window.onpopstate = function(event){
                alert('뒤로가기!!');
                // showPopupLayer('/apply/template/popup/211020pop', {}, false,'temPop');
            };
        });

        const onPushState = () => {
            $("#btn").click();
        }

        const setCookie = (name, value, expiredays) => {
            var date = new Date();
            date.setDate(date.getDate() + expiredays);
            document.cookie = escape(name) + "=" + escape(value) + "; expires=" + date.toUTCString();
        }

        const setVisit = (cnt) => {
            setCookie("popupYN", cnt, 1);
        }

        const closePopup = (cnt) => {
                setCookie("popupYN", cnt, 1);
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
            let cookieCheck = getCookie("popupYN");
            if ("1" == cookieCheck) {

                alert('두 번째 팝업');
                setVisit("2");// 두 번째 방문 기록
                return false;
            }

            if ("2" == cookieCheck) {

                alert('세 번째 팝업');
                setVisit("2");// 세 번째 방문 기록
                return false;
            }
            // ...

            alert('첫 방문 팝업');
            setVisit("1");// 첫 번째 방문 기록
            return false;
        }

    </script>
</head>
<body onload="javascript:onPushState()">

안녕하세요.

<input type="hidden" id="btn"></input>
</body>
</html>
