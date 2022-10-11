package cg.park.testSpringBoot.cote._2022._1006;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.HashMap;

@SpringBootTest
public class kakao {

    @Test
    public void test() {
//        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
//        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
//        int k = 2;

        String[] id_list = {"con", "ryan"};
        String[] report = {"ryan con", "ryan con", "ryan con", "ryan con"};
        int k = 2;

        Arrays.stream(solution(id_list, report, k)).forEach(System.out::print);// 2 1 1 0
    }

    public int[] solution(String[] id_list, String[] report, int k) {
        int[] users = new int[id_list.length];
        int[] answer = new int[id_list.length];
        HashMap<String, String> map = setId(id_list);

        Object[] list = Arrays.stream(report).distinct().toArray();

        for (Object reporter : list) {
            int index = Integer.parseInt(map.get(((String)reporter).split(" ")[1]));
            users[index] += 1;
        }

        for (Object reporter : list) {
            int index = Integer.parseInt(map.get(((String)reporter).split(" ")[1]));
            if (users[index] < k) continue;
            int answerIndex = Integer.parseInt(map.get(((String)reporter).split(" ")[0]));
            answer[answerIndex] += 1;
        }
        return answer;
    }

    public HashMap<String, String> setId(String[] id_list) {
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < id_list.length; i++) {
            map.put(i+"", id_list[i]);
            map.put(id_list[i], i+"");
        }
        return map;
    }


}
