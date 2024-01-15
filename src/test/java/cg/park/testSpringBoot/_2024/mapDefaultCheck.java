package cg.park.testSpringBoot._2024;

import cg.park.testSpringBoot.comm.util.Param;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class mapDefaultCheck {

    @Test
    public void test() {
        String today = "20240115";
        if ("20231231".compareTo(today) >= 0) {
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! counpon");
        }
        else {
            System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ end");
        }

        Param map = new Param();

        String str = (String) map.get("aaa");

        if (null == str) {
            System.out.println("null!!");
            return;
        }

        if ("".equals(str)) {
            System.out.println("white space!!!");
            return;
        }


    }
}
