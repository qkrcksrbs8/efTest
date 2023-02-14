function apiCouponDownload(couponIndexno) {
    $.post('/mypage/api/coupon/'+couponIndexno, function (data){
        apiCouponDownloadMsg(data.code, data.msg);
    })
}

function apiCouponDownloadMsg(code, msg) {
    if (code == 'P') {
        alert ('쿠폰번호를 확인해주세요.');
        return false;
    }
    if (code == 'L') {
        alert ('로그인 후에 사용해주세요.');
        return false;
    }
    if (code == 'C') {
        alert ('한정수량 마감되었습니다.');
        return false;
    }
    if (code == 'E') {
        alert ('기한만료된 쿠폰입니다.');
        return false;
    }
    if (code == 'M') {
        alert ('이미 보유한 쿠폰입니다.');
        return false;
    }
    if (code == 'D') {
        alert (msg);
        return false;
    }
    if (code == 'S') {
        alert ('쿠폰이 발급되었습니다.\n보유쿠폰에서 확인 할 수 있습니다.');
        return false;
    }
    if (code == 'F') {
        alert ('쿠폰 발글 중 오류가 발생했습니다.');
        return false;
    }
}