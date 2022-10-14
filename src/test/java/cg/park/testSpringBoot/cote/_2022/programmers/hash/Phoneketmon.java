package cg.park.testSpringBoot.cote._2022.programmers.hash;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.stream.Collectors;

@SpringBootTest
public class Phoneketmon {

    public int solution(int[] nums) {
        return Arrays.stream(nums)
                .boxed()
                .collect(Collectors.collectingAndThen(
                        Collectors.toSet(), p -> Integer.min(p.size(), nums.length / 2)));
    }

    @Test
    public void print () {
        System.out.println(solution(new int[]{1,1,1,2,2,2}));
    }
}
