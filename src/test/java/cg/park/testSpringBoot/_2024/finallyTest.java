package cg.park.testSpringBoot._2024;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class finallyTest {

    @Test
    public void test() {
        check();
    }

    public void check() {
        String str = "null";
        try {
            System.out.println("try start");
            if (1==1) {
                str = "if 1==1";
                return;
            }
            System.out.println("try end");
        }
        catch (Exception e) {
            System.out.println("ERROR: "+e);
        }
        finally {
            System.out.println("finally !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! str: "+str);
        }
        System.out.println("check end !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }
}
