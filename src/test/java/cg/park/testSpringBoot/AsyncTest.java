package cg.park.testSpringBoot;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

@SpringBootTest
public class AsyncTest {

    @Test
    public void test() {
        Executor executor = Executors.newFixedThreadPool(1);

        CompletableFuture.runAsync(() -> {
            try {
                Thread.sleep(10L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ": hi");
        }, executor);
    }
}
