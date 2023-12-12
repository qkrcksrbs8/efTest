package cg.park.testSpringBoot._2023;

import cg.park.testSpringBoot.comm.util.Param;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;

@SpringBootTest
public class Yyyymmddhhmm {

    @Test
    public void test() {
        System.out.println(isInvalidDate("202309022359"));
    }

    public boolean isInvalidDate(String date) {
        try {
            if (null == date) return false;
            if (8 == date.length()) return yyyymmdd(date);
            if (12 == date.length()) return yyyymmddhhmm(date);
            return false;
        }
        catch (Exception e) {
            return false;
        }
    }

    public boolean yyyymmdd(String date) {

        int yyyy = Integer.parseInt(date.substring(0, 4));
        int MM = Integer.parseInt(date.substring(4, 6));
        int dd = Integer.parseInt(date.substring(6, 8));

        return (dd <= lastDay(yyyy, MM) && dd > 1);
    }

    public boolean hhmm(String date) {

        int HH = Integer.parseInt(date.substring(8, 10));
        int mm = Integer.parseInt(date.substring(10, 12));

        if (0 > HH || HH >= 24) return false;
        if (0 > mm || mm >= 60) return false;
        return true;
    }

    public boolean yyyymmddhhmm(String date) {
        return yyyymmdd(date) && hhmm(date);
    }

    public int lastDay(int yyyy, int MM) {
        return dateMap(yyyy).get(MM);
    }

    public HashMap<Integer, Integer> dateMap(int yyyy) {
        return new Param()
                .set(1, 31)
                .set(2, ((yyyy - 2008) % 4 == 0) ? 29 : 28)
                .set(3, 31)
                .set(4, 30)
                .set(5, 31)
                .set(6, 30)
                .set(7, 31)
                .set(8, 31)
                .set(9, 30)
                .set(10, 31)
                .set(11, 30)
                .set(12, 31);
    }
}
