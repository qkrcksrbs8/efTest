package cg.park.testSpringBoot._2023;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class textExtraction {

    @Test
    public void test() {

        if (1 == 1) {
            System.out.println("confirm!!!!");
        }

        String url = "";

        if (contains(url, "happy", "kakao")) {
            System.out.println("save!!!!!!");
        }

        System.out.println("end");
    }

    public boolean contains(String str, String check) {
        return str.contains(check);
    }

    public boolean contains(String str, String check1, String check2) {
        return str.contains(check1) && str.contains(check2);
    }

}
