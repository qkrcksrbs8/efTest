package cg.park.testSpringBoot.cote._2022.programmers.search;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class card {
//https://school.programmers.co.kr/learn/courses/30/lessons/86491
    public int solution(int[][] sizes) {
        int max = 0;
        int min = 0;
        for (int[] size : sizes) {
            max = Integer.max(Integer.max(size[0], size[1]), max);
            min = Integer.max(Integer.min(size[0], size[1]), min);
        }
        return max * min;
    }


    @Test
    public void print() {
        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        System.out.println(solution(sizes));
    }
}
