package cg.park.testSpringBoot._2023;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AsyncTestController {

    @Test
    public void test() {
        System.out.println("============ Test Start ============");

        new Thread(() -> asyncTest()).start();


        System.out.println("============ Test E n d ============");

        try {
            Thread.sleep(3000L);
        }
        catch (Exception e) {

        }
        System.out.println("test E N D !!!!");
    }

    public void asyncTest() {
        System.out.println("async start");
        try {
            Thread.sleep(3000L);
            System.out.println("async access!!!!!!");
        }
        catch (Exception e) {
            System.out.println("error");
            System.out.println(e);
        }
    }
}
