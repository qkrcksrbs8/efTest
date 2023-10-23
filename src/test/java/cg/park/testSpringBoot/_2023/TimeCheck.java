package cg.park.testSpringBoot._2023;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

@SpringBootTest
public class TimeCheck {

    @Test
    public void test () {

        test2();
//        SimpleDateFormat tmpFormat = new SimpleDateFormat("yyyyMMddHHmm", Locale.KOREA);
//        String fDate = tmpFormat.format(new Date());
//        String startDate = "202311010330";
//
//        System.out.println("fDate: "+fDate);
//        if (startDate.compareTo(fDate) <= 0) {
//            System.out.println("tmpFormat: "+ fDate);
//        }

    }


    public void test2() {
        SimpleDateFormat todatCheck = new SimpleDateFormat("yyyyMMdd", Locale.KOREA);
        String fDate = todatCheck.format(new Date());
        int dc = "20231022".compareTo(fDate);
        System.out.println("dday: "+dc);

//        if (dc >= 0) {
//            System.out.println("0000");
//        }
//
//        if (dc >= 1) {
//            System.out.println("1111");
//        }
//
//        if (dc >= 2) {
//            System.out.println("22222");
//        }
//        if (dc >= 3) {
//            System.out.println("3333");
//        }
//        if (dc >= 4) {
//            System.out.println("4444");
//        }

        int cnt = dc > 3 ? 3 : dc;

        if (cnt >= 0) {
            System.out.println("###: "+0);
            for (int i = 1; i <= cnt; i++)
                System.out.println("###: "+i);
        }

    }
}
