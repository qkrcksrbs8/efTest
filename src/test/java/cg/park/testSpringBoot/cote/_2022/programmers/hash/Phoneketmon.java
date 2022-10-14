package cg.park.testSpringBoot.cote._2022.programmers.hash;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.stream.Collectors;

@SpringBootTest
public class Phoneketmon {


    // ��Ʈ���� ���.
    // boxed(): int -> Integer, double -> Double
    // collect: ������ Ÿ�� ����.
    // Collectors.toSet().size(): set���� �ߺ� ���� �� Count
    // (nums.length / 2): �Է� ���� ���ϸ� �� ����
    // Integer.min ���� �� �� ���� ���� ��ȯ.
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
