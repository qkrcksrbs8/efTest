package cg.park.testSpringBoot.cote._2022._1007;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class test {
    @Test
    public void tt() {

    }

    public void solution() {

    }

    public boolean isY(String flag) {
        boolean result;
        if (flag == null) {
            result = false; // ����
        }

        if (!flag.equals("Y")) {
            result = false; // ����
        }
        else {
            result = true;
        }
        return result;
    }

}
