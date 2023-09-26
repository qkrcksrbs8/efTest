package cg.park.testSpringBoot._2023;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@SpringBootTest
public class Shuffle {

    @Test
    public void test() {


        int count = 0;

        String[] gl = {
                "3", "3", "3", "3",
                "3", "3", "3", "3",
                "3", "3", "3", "3",
                "3", "3", "3", "3",
                "3", "3", "3", "3",
                "3", "3", "3", "3",
                "3", "3", "3", "3",
                "3", "3", "3", "3",

                "4", "4", "4", "4",
                "4", "4", "4", "4",
                "4", "4", "4", "4",
                "4", "4", "4", "4",
                "4", "4", "4", "4",
                "4", "4", "4", "4",
                "4", "4", "4", "4",

                "4", "4", "4", "4",
                "4", "4", "4", "4",
                "4", "4", "4", "4",
                "4", "4", "4", "4",
                "4", "4", "4", "4",
                "4", "4", "4", "4",
                "4", "4", "4", "4",

                "4", "4", "4", "4",
                "4", "4", "4", "4",
                "4", "4", "4", "4",
                "4", "4", "4", "4"
        };  //꽝 확률을 30%정도로 보정.

        for (int x = 0; x < 1000000; x++) {
            String[] gs = gl;

            List<String> l = Arrays.asList(gs);
            Collections.shuffle(l);

            for (String str : l) {
                if ("3".equals(str)) count++;
                break;
            }
        }

        System.out.println("count: "+count);


    }
}
