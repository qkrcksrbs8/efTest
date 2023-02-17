package cg.park.testSpringBoot.cote._2022.programmers.search;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class mockTest {

    public List<Integer> maxIntegers (int max, int[] cnt) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < cnt.length; i++) {
            if(max == cnt[i]) list.add(i+1);
        }
        return list;
    }

    public int maxScore(int[] cnt) {
        return Math.max(cnt[0], Math.max(cnt[1], cnt[2]));
    }

    public int[] solution(int[] answers) {

        int[] person1 = {1, 2, 3, 4, 5};
        int[] person2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] person3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] cnt = new int[3];
        for(int i=0; i < answers.length; i++){
            if(answers[i] == person1[i%5]) cnt[0]++;
            if(answers[i] == person2[i%8]) cnt[1]++;
            if(answers[i] == person3[i%10]) cnt[2]++;
        }

        return maxIntegers(maxScore(cnt), cnt)
                .stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    @Test
    public void print() {

    }
}
