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
        sleep(3000L);
        System.out.println("test E N D !!!!");
    }

    public void asyncTest() {
        System.out.println("async start");
        sleep(3000L);
        System.out.println("async access!!!!!!");
    }

    public void sleep(long millis) {
        try {
            Thread.sleep(millis);
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
