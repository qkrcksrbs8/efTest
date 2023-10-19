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
        SimpleDateFormat tmpFormat = new SimpleDateFormat("yyyyMMddHHmm", Locale.KOREA);
        String fDate = tmpFormat.format(new Date());
        String startDate = "202310191603";

        System.out.println("fDate: "+fDate);
        if (startDate.compareTo(fDate) <= 0) {
            System.out.println("tmpFormat: "+ fDate);
        }

    }
}
