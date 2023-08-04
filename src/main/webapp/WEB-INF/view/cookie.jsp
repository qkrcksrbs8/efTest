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


        let addUl = () => {
            let memUl = document.createElement("ul");
            memUl.setAttribute("class", "aaaa");
            let memLi1 = document.createElement("li");
            let memLi2 = document.createElement("li");
            let memLi3 = document.createElement("li");
            let memLi4 = document.createElement("li");
            let str1 = document.createElement("strong");
            let str2 = document.createElement("strong");
            let str3 = document.createElement("strong");
            let str4 = document.createElement("strong");
            let sp1 = document.createElement("spen");
            let sp2 = document.createElement("spen");
            let sp3 = document.createElement("spen");
            let sp4 = document.createElement("spen");
            str1.appendChild(document.createTextNode('첫 번째 : '));
            str2.appendChild(document.createTextNode('두 번째 :'));
            str3.appendChild(document.createTextNode('세 번째 : '));
            str4.appendChild(document.createTextNode('네 번째 : '));
            sp1.appendChild(document.createTextNode('오잉'));
            sp2.appendChild(document.createTextNode('또잉'));
            sp3.appendChild(document.createTextNode('오우'));
            sp4.appendChild(document.createTextNode('fiveCow'));
            str1.appendChild(sp1);
            str2.appendChild(sp2);
            str3.appendChild(sp3);
            str4.appendChild(sp4);
            memLi1.appendChild(str1);
            memLi2.appendChild(str2);
            memLi3.appendChild(str3);
            memLi4.appendChild(str4);

            // div > a > span 선택버튼 생성
            let memA = document.createElement("a");
            let memSp1 = document.createElement("span");
            let memSp2 = document.createElement("span");
            memSp1.appendChild(document.createTextNode('선'));
            memSp2.appendChild(document.createTextNode('택'));
            memA.appendChild(memSp1);
            memA.appendChild(memSp2);
            memA.setAttribute("class", "cccc");

            memUl.appendChild(memLi1);
            memUl.appendChild(memLi2);
            memUl.appendChild(memLi3);
            memUl.appendChild(memLi4);

            let memDiv = document.createElement("div");
            memDiv.setAttribute("class", "bbb");
            memDiv.appendChild(memA);

            $("#memberTable").empty().append(memUl).append(memDiv);
        }


    </script>
</head>
<body onload="javascript:onPushState()">

안녕하세요.
<button style="width:100px; height:50px;" onclick="addUl();"> 테이블 생성 </button>

<div id="memberTable">

</div>

<input type="hidden" id="btn"></input>
</body>
</html>
