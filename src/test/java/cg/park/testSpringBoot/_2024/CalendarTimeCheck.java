package cg.park.testSpringBoot._2024;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalendarTimeCheck {

    @Test
    public void test() {


        if ("20240328".compareTo("20240301") <= 0) {
            System.out.println("!!!!!");
        }
    }
}
