<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="UTF-8" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Frameset//EN" "http://www.w3.org/TR/html4/frameset.dtd">
<html lang="ko">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>Spring Boot Application</title>
</head>
<body>
<form method="POST" action="/checkbox">
    <label><input type="checkbox" name="nb" value="all"> 전점 공통</label>
    <label><input type="checkbox" name="nb" value="gr"> 구로</label>
    <label><input type="checkbox" name="nb" value="sw"> 수원</label>
    <label><input type="checkbox" name="nb" value="bd"> 분당</label>
    <label><input type="checkbox" name="nb" value="pt"> 평택</label>
    <label><input type="checkbox" name="nb" value="oj"> 원주</label>
    <p>
    <label><input type="checkbox" name="nb" value="gm"> 광명</label>
    <label><input type="checkbox" name="nb" value="hd"> 홍대</label>
    <label><input type="checkbox" name="nb" value="gh"> 기흥</label>
    <label><input type="checkbox" name="nb" value="sj"> 세종</label>
    <label><input type="checkbox" name="nb" value="gj"> 금정</label>
    <p>
    <input type="submit" value="Submit">

</form>
</body>
</html>
