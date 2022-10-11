<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Frameset//EN" "http://www.w3.org/TR/html4/frameset.dtd">
<html lang="ko">
<head>
    <script src="http://code.jquery.com/jquery-3.5.1.min.js"></script>

    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>Spring Boot Application</title>
    <script type="application/javascript">
        const countCheck = (field, max, type) => {
            let name = field.name;
            let checkCount = $("input:checkbox[name="+name+"]:checked").length

            if (max == 1) {
                $("input:checkbox[name="+name+"]:checked").each(function() {
                    this.checked = false;
                })
                field.checked = true;
                return false;
            }

            if (checkCount > max) {
                alert(type+"타입은 최대 "+max+"개까지 가능합니다.");
                field.checked = false;
            }
        }

        const reload = (value) => {
            location.href="/?grade="+value;
        }

        const regist = () => {
            let checkList = [];
            let cnt = 0;
            $("input[type=checkbox]:checked").each(function() {
                checkList[cnt] = this.value
                cnt++;
            });

            alert(checkList);
        }

        const giftList = () => {
            location.href = 'giftList';
        }

    </script>
</head>
<body>
<form method="POST" id="nbForm" action="/checkbox">
<%--    <label><input type="checkbox" id="nb1" name="nb" value="all"> 전점 공통</label>--%>
<%--    <label><input type="checkbox" id="nb2" name="nb" value="gr"> 구로</label>--%>
<%--    <label><input type="checkbox" id="nb3" name="nb" value="sw"> 수원</label>--%>
<%--    <label><input type="checkbox" id="nb4" name="nb" value="bd"> 분당</label>--%>
<%--    <label><input type="checkbox" id="nb5" name="nb" value="pt"> 평택</label>--%>
<%--    <label><input type="checkbox" id="nb6" name="nb" value="oj"> 원주</label>--%>
<%--    <p>--%>
<%--    <label><input type="checkbox" id="nb7" name="nb" value="gm"> 광명</label>--%>
<%--    <label><input type="checkbox" id="nb8" name="nb" value="hd"> 홍대</label>--%>
<%--    <label><input type="checkbox" id="nb9" name="nb" value="gh"> 기흥</label>--%>
<%--    <label><input type="checkbox" id="nb10" name="nb" value="sj"> 세종</label>--%>
<%--    <label><input type="checkbox" id="nb11" name="nb" value="gj"> 금정</label>--%>

    <%--<c:forEach var="noticeDto" items="${divisionList.codes}">
        <label>
            <input type="checkbox" onclick="countCheck(this);" name="nb" value="${noticeDto.codes}">
                ${noticeDto.codeName}</label>
    </c:forEach>--%>

<%--    <select name="grade" id="grade">--%>
<%--        <option value="DIAMOND"> DIAMOND </option>--%>
<%--        <option value="GOLD"> GOLD </option>--%>
<%--    </select>--%>

    <input type="button" onclick="giftList();" value="명절선물">
    <p>

    <select name="grade" id="grade" onchange="reload(this.value);">
        <c:forEach var="grades" items="${gradeList.codes }">
            <option value="${grades.grade}" <c:if test="${grades.grade == grade }"> selected </c:if>> ${grades.grade} </option>
        </c:forEach>
    </select>
    <p>

    <ul>
        <c:forEach var="row" items="${holydayEventList.codes }">
            <c:if test="${row.bannerFg eq 'Y'}">
                <p>
                <c:out value="${row.type }"/>타입 (택<c:out value="${row.typeCount }"/>)
            </c:if>
            <li>
                <label>
                    <c:out value="${row.viewName }"/>
                    <input type="checkbox" onclick="countCheck(this, ${row.typeCount}, '${row.type}');" name="${row.holydayGrade}" value="${row.viewName }">
                </label>
            </li>
        </c:forEach>
    </ul>

<%--    A타입 (택1)--%>
<%--        <br>--%>
<%--    <ul>--%>
<%--        <li>--%>
<%--            <label>--%>
<%--                중부 C.C 골프 라운딩--%>
<%--                <input type="checkbox" onclick="countCheck(this, 1);" name="DIAMONDA" value="DIAMONDA1">--%>
<%--            </label>--%>
<%--        </li>--%>
<%--        <li>--%>
<%--            <label>--%>
<%--                워커힐 1박--%>
<%--                <input type="checkbox" onclick="countCheck(this, 1);" name="DIAMONDA" value="DIAMONDA1">--%>
<%--            </label>--%>
<%--        </li>--%>
<%--        <li>--%>
<%--            <label>--%>
<%--                제주도 1박--%>
<%--                <input type="checkbox" onclick="countCheck(this, 1);" name="DIAMONDA" value="DIAMONDA1">--%>
<%--            </label>--%>
<%--        </li>--%>
<%--        <li>--%>
<%--            <label>--%>
<%--                국내비행--%>
<%--                <input type="checkbox" onclick="countCheck(this, 1);" name="DIAMONDA" value="DIAMONDA1">--%>
<%--            </label>--%>
<%--        </li>--%>
<%--    </ul>--%>
<%--    B타입 (택2)--%>
<%--    <br>--%>
<%--    <ul>--%>
<%--        <li>--%>
<%--            <label>--%>
<%--                파크 하얏트(부산) 1박--%>
<%--                <input type="checkbox" onclick="countCheck(this, 2);" name="DIAMONDB" value="DIAMONDB1">--%>
<%--            </label>--%>
<%--        </li>--%>
<%--        <li>--%>
<%--            <label>--%>
<%--                씨마크호텔(강릉) 1박--%>
<%--                <input type="checkbox" onclick="countCheck(this, 2);" name="DIAMONDB" value="DIAMONDB2">--%>
<%--            </label>--%>
<%--        </li>--%>
<%--        <li>--%>
<%--            <label>--%>
<%--                씨마크호텔(강릉) 2박--%>
<%--                <input type="checkbox" onclick="countCheck(this, 2);" name="DIAMONDB" value="DIAMONDB2">--%>
<%--            </label>--%>
<%--        </li>--%>
<%--        <li>--%>
<%--            <label>--%>
<%--                여수밤바다(여수) 1박--%>
<%--                <input type="checkbox" onclick="countCheck(this, 2);" name="DIAMONDB" value="DIAMONDB2">--%>
<%--            </label>--%>
<%--        </li>--%>
<%--    </ul>--%>
<%--    C타입 (택2)--%>
<%--    <br>--%>
<%--    <ul>--%>
<%--        <li>--%>
<%--            <label>--%>
<%--                라한셀렉트(경주) 2박--%>
<%--                <input type="checkbox" onclick="countCheck(this, 2);" name="DIAMONDC" value="DIAMONDC1">--%>
<%--            </label>--%>
<%--        </li>--%>
<%--        <li>--%>
<%--            <label>--%>
<%--                경원재(인천) 1박--%>
<%--                <input type="checkbox" onclick="countCheck(this, 2);" name="DIAMONDC" value="DIAMONDC2">--%>
<%--            </label>--%>
<%--        </li>--%>
<%--        <li>--%>
<%--            <label>--%>
<%--                한강앞(서울) 1박--%>
<%--                <input type="checkbox" onclick="countCheck(this, 2);" name="DIAMONDC" value="DIAMONDC1">--%>
<%--            </label>--%>
<%--        </li>--%>
<%--        <li>--%>
<%--            <label>--%>
<%--                부산리조트(부산) 1박--%>
<%--                <input type="checkbox" onclick="countCheck(this, 2);" name="DIAMONDC" value="DIAMONDC2">--%>
<%--            </label>--%>
<%--        </li>--%>
<%--    </ul>--%>
    <p>
    <input type="button" onclick="regist();" value="신청">

</form>
</body>
</html>
