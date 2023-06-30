package cg.park.testSpringBoot._2023;

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AsyncTestService {


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
        System.out.println("async end");
    }
}
