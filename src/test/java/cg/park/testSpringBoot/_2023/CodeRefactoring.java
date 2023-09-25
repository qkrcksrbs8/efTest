package cg.park.testSpringBoot._2023;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

@SpringBootTest
public class CodeRefactoring {

    @Test
    public void test() {
        System.out.println(splitAndsum(null));
        System.out.println(splitAndsum(""));
        System.out.println(splitAndsum("1"));
        System.out.println(splitAndsum("1,2"));
        System.out.println(splitAndsum("1,2:3"));
    }


    // (숫자),(,),(:) 세가지만 들어옴
    // (,),(:) 기호를 기준으로 더해주기
    // 1 => 1
    // 1,2 => 1+2 => 3
    // 1,2:3 => 1+2+3 => 6
    public static int splitAndSumTest(String text) {
        int result = 0;
        if (text == null || text.isEmpty()) {
            result = 0;
        }
        else {
            String [] values = text.split(",|:");
            for (String value : values) {
                result += Integer.parseInt(value);
            }
        }
        return result;
    }

    public static int splitAndsum(String number) {
        return (isBlank(number)) ? 0 : sum(toInt(number.split(",|:")));
    }

    public static boolean isBlank(String text) {
        return text == null || text.isEmpty();
    }

    public static int sum (int[] values) {
        return Arrays.stream(values).sum();
    }

    public static int[] toInt(String[] values) {
        return Arrays.stream(values).mapToInt(Integer::parseInt).toArray();
    }

}
