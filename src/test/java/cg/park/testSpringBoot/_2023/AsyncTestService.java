package cg.park.testSpringBoot._2023;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
@SpringBootTest
public class AsyncTestService {


    @Async
    public void asyncTest() {
        System.out.println("async start");
        try {
            Thread.sleep(3000L);
            System.out.println("async access!!!!!!");
        }
        catch (Exception e) {
            System.out.println(e.toString());
        }
        System.out.println("async end");
    }
}
