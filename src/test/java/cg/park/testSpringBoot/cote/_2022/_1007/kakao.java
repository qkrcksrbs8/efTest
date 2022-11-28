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

    public int[] search(int n, int[] info) {
        int resource = n;
        int loopCnt = info.length;

        int maxScore = 0;
        int loopScore = 0;
        int[] result = new int[loopCnt];
        int[] loopArray;
        for (int i = 0; i < loopCnt; i++) {

            loopScore = 0;
            loopArray = new int[loopCnt];
            resource = n;

            int apeachScore = info[i];
            if (apeachScore >= resource) return new int[]{-1};

            resource -= apeachScore+1;
            loopScore += 10-i;
            loopArray[i] = apeachScore+1;

            if (resource == 0) {
                if (maxScore < loopScore) {
                    maxScore = loopScore;
                    result = new int[loopCnt];
                    result[i] = apeachScore+1;
                }
                continue;
            }

            for (int j = i+1; j < loopCnt-i; j++) {

                int matchScore = info[j];
                if (matchScore >= resource) continue;
                resource -= matchScore+1;
                loopScore += 10-(i+1);
                loopArray[j] = matchScore+1;

            }

            if (maxScore < loopScore) {
                maxScore = loopScore;
                result = loopArray;
            }

        }
        return result;
    }

    public boolean isSameHit(int n, int[] info) {
        int hit = 0;
        for (int i : info)
            if (i > 0) hit++;

        return hit >= n;
    }

    public int[] solution(int n, int[] info) {
        if (isSameHit(n, info)) return new int[]{-1};// ���ʿ� ��� �� �ۿ� ������ -1

        return search(n, info);
    }



}
