package cg.park.testSpringBoot.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;

@RequestMapping("/mypage")
@Controller
public class Coupon {

    @PostMapping("/api/coupon/{couponIndexno}")
    public ResponseEntity<HashMap> apiCoupon(@PathVariable String couponIndexno) {
        return new ResponseEntity<>(apiCouponDownload(couponIndexno), HttpStatus.OK);
    }

    public HashMap<String, String> apiCouponDownload(String couponIndexno) {
        HashMap<String, String> map = new HashMap<>();
        try {
            if (null == couponIndexno) {
                map.put("code", "L");
                return map;// 로그인필요
            }

            if ("1".equals(couponIndexno)) {
                map.put("code", "C");
                return map;// 한정수량마감
            }

            if ("2".equals(couponIndexno)) {
                map.put("code", "E");
                return map;// 기한만료
            }

            // COUNT 있으면 이미 보유한 쿠폰입니다.
            if ("3".equals(couponIndexno)) {
                map.put("code", "M");
                return map;// 보유한 쿠폰
            }

            // COUNT 있으면 이미 보유한 쿠폰입니다.
            if ("4".equals(couponIndexno)) {
                map.put("code", "P");
                return map;// 보유한 쿠폰
            }
            map.put("code", "S");
            return map;
        }
        catch (Exception e) {
            map.put("code", "F");
            return map;
        }
    }

}
