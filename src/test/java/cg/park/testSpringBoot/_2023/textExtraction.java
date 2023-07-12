package cg.park.testSpringBoot._2023;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class textExtraction {

    @Test
    public void test() {
        String url = "https://api.happysync.io/api/v1/oauth/kakao/63b177528f502a707b8b5b3e";

        if (url.contains("happysync") && url.contains("kakao")) {
            System.out.println("save!!!!!!");
        }

        System.out.println("end");
    }

}
