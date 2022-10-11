<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="UTF-8" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Frameset//EN" "http://www.w3.org/TR/html4/frameset.dtd">
<html lang="ko">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>밥밥밥</title>
</head>
<body>
<form method="POST" action="/checkbox">
    식사 시간
    <label><input type="checkbox" name="timeType" value="LC"> 점심</label>
    <label><input type="checkbox" name="timeType" value="DN"> 저녁</label>
    <p>
    <label><input type="text" name="restaurantName" > 매장명</label>
    <p>
    <label><input type="text" name="minuteWalkingDistance" > 도보 거리</label>
    <p>
    <label><input type="text" name="visitDate" > 작성일 (ex.YYYYmmdd)</label>
    <p>
    음식 종류
    <label><input type="checkbox" name="foodType" value="KR"> 한식</label>
    <label><input type="checkbox" name="foodType" value="JP"> 일식</label>
    <label><input type="checkbox" name="foodType" value="CN"> 중식</label>
    <label><input type="checkbox" name="foodType" value="UR"> 양식</label>
    <p>
    <label><input type="text" name="foodName" > 음식 이름</label>
    <p>
    맛 점수
    <label><input type="checkbox" name="tasteLank" value="S"> 아주 맛있음</label>
    <label><input type="checkbox" name="tasteLank" value="A"> 맛있음</label>
    <label><input type="checkbox" name="tasteLank" value="B"> 평범함</label>
    <label><input type="checkbox" name="tasteLank" value="C"> 별로</label>
    <label><input type="checkbox" name="tasteLank" value="D"> 절대안감</label>
    <p>
    <label><input type="text" name="createdBy" > 작성자</label>
    <p>
    <input type="submit" value="Submit">

</form>
</body>
</html>
