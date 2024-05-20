package cg.park.testSpringBoot._2024.progremers;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

@SpringBootTest
public class MaxInt {

    @Test
    public void test() {

        int[] numbers = {3, 30, 34, 5, 9};
        System.out.println("result: "+solution(numbers));
    }


    public String solution(int[] numbers) {

        String[] arr = Arrays.stream(numbers)
                            .mapToObj(String::valueOf)
                            .toArray(String[]::new);

        Arrays.sort(arr, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));

        return ("0".equals(arr[0]))
                ? "0"
                : String.join("", arr);
    }

}
