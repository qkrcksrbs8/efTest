<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Frameset//EN" "http://www.w3.org/TR/html4/frameset.dtd">
<html lang="ko">
<head>
    <script src="http://code.jquery.com/jquery-3.5.1.min.js"></script>

    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>Spring Boot Application</title>
    <script type="application/javascript">

        const countCheck = (field, max) => {
            let name = field.name;

            if (max == 1) {
                $("input:checkbox[name="+name+"]:checked").each(function() {
                    this.checked = false;
                })
                field.checked = true;
                return false;
            }
        }

        const reload = (value) => {
            location.href="/giftList?grade="+value;
        }

        const registPop = () => {
            $("#ulList").css("background", "dimgray");
            $("#itemList").css("display", "block");
        }

        const regist = () => {
            let item;
            $("input[type=checkbox]:checked").each(function() {
                item = this.value
            });

            alert(item);
        }

        const cancel = (name) => {
            $("input:checkbox[name="+name+"]:checked").each(function() {
                this.checked = false;
            })
            $("#ulList").css("background", "");
            $("#itemList").css("display", "none");
        }
        const indexList = () => {
            location.href = '/';
        }

    </script>
</head>
<body>
<form method="POST" id="nbForm" action="/checkbox">

    <input type="button" onclick="indexList();" value="문화프로그램 이동">
    <p>

    <select name="grade" id="grade" onchange="reload(this.value);">
        <c:forEach var="grades" items="${gradeList.codes }">
            <option value="${grades.grade}" <c:if test="${grades.grade == grade }"> selected </c:if>> ${grades.grade} </option>
        </c:forEach>
    </select>
    <p>

    <ul id="ulList">
        <c:forEach var="row" items="${holydayEventList.codes }">
            <li>
                <label>
                    <c:out value="${row.title }"/>
                </label>
            </li>
        </c:forEach>
    <p>
        <input type="button" onclick="registPop();" value="신청">
    </ul>

    <div id="itemList" style="display: none;">
    <input type="button" onclick="cancel('seqs');" value="창닫기">
    <c:forEach var="row" items="${holydayEventList.codes }" varStatus="i">
        <li>
            <label>
                <c:out value="${i.count}"/>.
                <c:out value="${row.title }"/>
                <input type="checkbox" onclick="countCheck(this, '1');" name="seqs" value="${row.title }">
            </label>
        </li>
    </c:forEach>
        <p>
        <input type="button" onclick="regist();" value="신청">
    </div>
</div>

</form>
</body>
</html>
