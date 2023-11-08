package cg.park.testSpringBoot._2023;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class daysCheck {

    @Test
    public void test() {
        String startDate = "20230809";
        String endDate = "20230831";
        String today = "20231101";

        String pw = "20231001";

        if (today.compareTo(pw) > 0) {
            System.out.println("!!!!!!!!");
        }

//        if (startDate.compareTo(today) <= 0 && endDate.compareTo(today) >= 0) {
//            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!");
//        }
//
//        String newDate = "20231111";
//
//        if (newDate.compareTo(today) > 0) {
//            System.out.println("@@@@@@@@@@@@@@@@@@@@");
//        }

    }

}
