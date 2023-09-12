<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Frameset//EN" "http://www.w3.org/TR/html4/frameset.dtd">
<html lang="ko">
<head>
    <script src="http://code.jquery.com/jquery-3.5.1.min.js"></script>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>Spring Boot Application</title>
    <script src="https://script.vreview.tv/vreview.widget.js"></script>
</head>
<body>


<div class="vreview-summary-widget"></div>

<form method="POST" id="nbForm" action="/checkbox">
    <input type="button" onclick="placeholderCheck();" value="버튼입니다.">

    <input type="button" onclick="" value="신청">
    <input type="text" id="placeholderCheck_id" name="placeholderCheck_id" value="" placeholder="‘-’ 없이 번호만 입력해주세요.">
</form>






<script>
    vreviewWidget.initialize({
        uuid: '75804e73-e4ab-4885-9f13-53e346aca259',
        originMemberId: myShop.currentMemberId,
    });
</script>

</body>
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


    function apiCouponDownload(couponIndexno) {
        $.post('/mypage/api/coupon/'+couponIndexno, function (data){
            apiCouponDownloadMsg(data.code, data.msg);
        })
    }

    const placeholderCheck = () => {
        let id = $("input[name=placeholderCheck_id]").val();
        let holder = $("input[name=placeholderCheck_id]").attr("placeholder");

        alert('id: '+id +'\nholder: '+holder);
    }

</script>
</html>
