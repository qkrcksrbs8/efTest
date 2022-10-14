package cg.park.testSpringBoot.cote._2022.programmers.hash;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.stream.Collectors;

@SpringBootTest
public class Phoneketmon {


    // 스트림을 사용.
    // boxed(): int -> Integer, double -> Double
    // collect: 데이터 타입 지정.
    // Collectors.toSet().size(): set으로 중복 제거 후 Count
    // (nums.length / 2): 입력 받은 폰켓몬 수 절반
    // Integer.min 으로 둘 중 작은 수를 반환.
    public int solution(int[] nums) {
        return Integer.min(
                Arrays.stream(nums)
                        .boxed()
                        .collect(Collectors.toSet()).size(), (nums.length / 2)
        );
    }

    @Test
    public void print () {
        System.out.println(solution(new int[]{1,1,1,2,2,2}));
    }
}
