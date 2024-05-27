package cg.park.testSpringBoot._2024;

import cg.park.testSpringBoot.comm.util.Param;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class encodingTest {

    @Test
    public void test() {
        System.out.println(String.valueOf(new Param("key", "{aaaa:aaaa}")));

    }
}
