package cg.park.testSpringBoot._2024;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;

@SpringBootTest
public class timeyymmddhhmmss {

    @Test
    public void test() {

        Date today = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmm");

        LocalTime now = LocalTime.now();        // 현재시간 출력
        int hour = now.getHour();
        int minute = now.getMinute();

        String time = dateFormat.format(today) + hour + minute;

        String s = "202403141215";
        String e = "202403142300";

        System.out.println(dateFormat.format(today));
        System.out.println(time);
        System.out.println(s);
        System.out.println(e);
        System.out.println((s.compareTo(time) <= 0 && e.compareTo(time) >= 0));

    }
}
