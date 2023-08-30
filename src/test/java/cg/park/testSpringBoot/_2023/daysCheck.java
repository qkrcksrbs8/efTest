package cg.park.testSpringBoot._2023;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class daysCheck {

    @Test
    public void test() {
        String startDate = "20230809";
        String endDate = "20230831";
        String today = "20230809";

        if (startDate.compareTo(today) <= 0 && endDate.compareTo(today) >= 0) {
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!");
        }

    }

}
