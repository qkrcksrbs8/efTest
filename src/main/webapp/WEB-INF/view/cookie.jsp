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
            let pcgUl = document.createElement("ul");
            pcgUl.setAttribute("class", "aaaa");
            let pcgLi1 = document.createElement("li");
            let pcgLi2 = document.createElement("li");
            let pcgLi3 = document.createElement("li");
            let pcgLi4 = document.createElement("li");
            let pcgStr1 = document.createElement("strong");
            let pcgStr2 = document.createElement("strong");
            let pcgStr3 = document.createElement("strong");
            let pcgStr4 = document.createElement("strong");
            let pcgSp1 = document.createElement("spen");
            let pcgSp2 = document.createElement("spen");
            let pcgSp3 = document.createElement("spen");
            let pcgSp4 = document.createElement("spen");
            pcgStr1.appendChild(document.createTextNode('첫 번째 : '));
            pcgStr2.appendChild(document.createTextNode('두 번째 :'));
            pcgStr3.appendChild(document.createTextNode('세 번째 : '));
            pcgStr4.appendChild(document.createTextNode('네 번째 : '));
            pcgSp1.appendChild(document.createTextNode('오잉'));
            pcgSp2.appendChild(document.createTextNode('또잉'));
            pcgSp3.appendChild(document.createTextNode('오우'));
            pcgSp4.appendChild(document.createTextNode('fiveCow'));
            pcgStr1.appendChild(pcgSp1);
            pcgStr2.appendChild(pcgSp2);
            pcgStr3.appendChild(pcgSp3);
            pcgStr4.appendChild(pcgSp4);
            pcgLi1.appendChild(pcgStr1);
            pcgLi2.appendChild(pcgStr2);
            pcgLi3.appendChild(pcgStr3);
            pcgLi4.appendChild(pcgStr4);

            // div > a > span 선택버튼 생성
            let pcgA = document.createElement("a");
            let pcgSpan1 = document.createElement("span");
            let pcgSpan2 = document.createElement("span");
            pcgSpan1.appendChild(document.createTextNode('선'));
            pcgSpan2.appendChild(document.createTextNode('택'));
            pcgA.appendChild(pcgSpan1);
            pcgA.appendChild(pcgSpan2);
            pcgA.setAttribute("class", "cccc");

            pcgUl.appendChild(pcgLi1);
            pcgUl.appendChild(pcgLi2);
            pcgUl.appendChild(pcgLi3);
            pcgUl.appendChild(pcgLi4);

            let pcgDiv = document.createElement("div");
            pcgDiv.setAttribute("class", "bbb");
            pcgDiv.appendChild(pcgA);

            $("#pcgTable").empty().append(pcgUl).append(pcgDiv);
        }


    </script>
</head>
<body onload="javascript:onPushState()">

안녕하세요.
<button style="width:100px; height:50px;" onclick="addUl();"> 테이블 생성 </button>

<div id="pcgTable">

</div>

<input type="hidden" id="btn"></input>
</body>
</html>
