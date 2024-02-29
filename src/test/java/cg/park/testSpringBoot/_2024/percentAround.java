package cg.park.testSpringBoot._2024;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class percentAround {

    @Test
    public void test() {
        int p1 = 12304;
        int p2 = 78000;

        int dp = (int) (p1 * 0.8);
        //9843.2
        System.out.println("dp: "+dp);
    }
}
