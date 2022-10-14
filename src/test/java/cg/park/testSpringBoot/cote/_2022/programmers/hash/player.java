package cg.park.testSpringBoot.cote._2022.programmers.hash;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashSet;

@SpringBootTest
public class player {

    public void playerCheck(HashSet<String> set, String[] players) {
        for (String p : players) {
            if (set.contains(p)) {
                set.remove(p);
                continue;
            }
            set.add(p);
        }
    }

    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashSet<String> set = new HashSet<>();
        playerCheck(set, participant);
        playerCheck(set, completion);
        answer = set.toString();
        return answer.substring(1, answer.length()-1);
    }

    @Test
    public void print() {
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};

        System.out.println(solution(participant, completion));

    }
}
