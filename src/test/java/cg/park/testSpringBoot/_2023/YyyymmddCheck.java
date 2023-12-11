package cg.park.testSpringBoot._2023;

import cg.park.testSpringBoot.comm.util.Param;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;

@SpringBootTest
public class YyyymmddCheck {

    @Test
    public void test()       {
        System.out.println("isInvalidDate: "+isInvalidDate("20231207"));
    }

    public boolean isInvalidDate(String date) {
        if (null == date || 8 != date.length()) return false;

        int yyyy = Integer.parseInt(date.substring(0, 4));
        int MM = Integer.parseInt(date.substring(4, 6));
        int dd = Integer.parseInt(date.substring(6, 8));

        return (dd <= lastDay(yyyy, MM) && dd > 1);
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
