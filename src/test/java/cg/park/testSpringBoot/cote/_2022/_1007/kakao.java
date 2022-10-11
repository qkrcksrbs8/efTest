package cg.park.testSpringBoot.cote._2022._1007;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

@SpringBootTest
public class kakao {

    @Test
    public void print() {
        int n = 5;
        int[] info = {2,1,1,1,0,0,0,0,0,0,0};
        int[] result = solution(n, info);
        Arrays.stream(result).forEach(System.out::println);
    }

    public int[] solution(int n, int[] info) {
        int[] answer = {};

        int hit = 0;
        for (int i : info) {
            if (i > 0) {
                hit++;
            }
        }
        if (hit >= n) {
            return new int[]{-1};
        }

        int[] arr =  ifor(10, info);

        return answer;
    }

    public int[] ifor(int i, int[] info) {
        if (i == 0) return info;
        int x = info[10-i];


        return ifor(i-1, info);
    }


}
