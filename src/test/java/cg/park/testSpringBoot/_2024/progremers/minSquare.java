package cg.park.testSpringBoot._2024.progremers;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class minSquare {

    @Test
    public void test() {
        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        System.out.println(sizes);
    }

    public int solution(int[][] sizes) {
        int maxSize = 0;
        int minSize = 0;
        for (int[] size : sizes) {
            maxSize = Math.max(maxSize, Math.max(size[0], size[1]));
            minSize = Math.max(minSize, Math.min(size[0], size[1]));
        }

        return maxSize * minSize;
    }

}
