package cg.park.testSpringBoot._2023;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;

@SpringBootTest
public class MapNullTest {

    @Test
    public void test() {

        try {
            HashMap map = null;

            map.get("name");

            System.out.println("!!!!!!!!!!");
        }
        catch (Exception e) {

            System.out.println("@@@@@@@@@@@@@");
        }

    }
}
