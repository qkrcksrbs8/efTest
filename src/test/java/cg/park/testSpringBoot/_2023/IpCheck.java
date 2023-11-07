package cg.park.testSpringBoot._2023;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class IpCheck {

    @Test
    public void test() {

//        162.221.144.0	162.221.147.255
//        167.88.52.0	167.88.55.255
//        192.190.19.0	192.190.19.255
//        216.38.167.0	216.38.167.255
//        64.40.4.0	64.40.7.255
//        64.66.32.0	64.66.35.255

        String ip = "10.40.137.243";

        System.out.println(ip.substring(0, ip.lastIndexOf(".")));

    }

    public boolean isUCM(String ip) {
        // 미국, 캐나다, 맥시코 IP 체크 함수
        //
        return false;
    }

}
