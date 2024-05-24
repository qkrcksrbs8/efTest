package cg.park.testSpringBoot._2024.progremers;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.stream.Collectors;

@SpringBootTest
public class Phonekemon {

    @Test
    public void test() {
        int[] nums = {3,1,2,3};
        System.out.println("result: "+solution(nums));

    }

    public int solution(int[] nums) {
        return (int) Math.min(
                Arrays
                    .stream(nums)
                    .boxed()
                    .collect(Collectors.toSet()).stream().count()
                , nums.length/2
        );
    }

}
