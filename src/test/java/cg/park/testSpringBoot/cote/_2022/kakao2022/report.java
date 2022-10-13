package cg.park.testSpringBoot.cote._2022.kakao2022;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.HashMap;

@SpringBootTest
public class report {

    public HashMap<String, String> setId(String[] id_list) {
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < id_list.length; i++) {
            map.put(i+"", id_list[i]);
            map.put(id_list[i], i+"");
        }
        return map;
    }

    public int[] getReportCounts(HashMap<String, String> map, String[] list, int cnt) {
        int[] result = new int[cnt];
        for (String reporter : list) {
            int index = Integer.parseInt(map.get((reporter).split(" ")[1]));
            result[index] += 1;
        }
        return result;
    }

    public int[] getMailCounts(HashMap<String, String> map, String[] list, int[] reportCounts, int k) {
        int[] result = new int[reportCounts.length];
        for (String reporter : list) {
            int index = Integer.parseInt(map.get((reporter).split(" ")[1]));
            if (reportCounts[index] < k) continue;
            int answerIndex = Integer.parseInt(map.get((reporter).split(" ")[0]));
            result[answerIndex] += 1;
        }
        return result;
    }

    public int[] solution(String[] id_list, String[] report, int k) {

        // 1. 아이디 리스트 정렬
        HashMap<String, String> map = setId(id_list);

        // 2. 신고 내역 중복 제거
        String[] list = Arrays.stream(report).distinct().toArray(String[]::new);

        // 3. 신고 내역 취합
        int[] reportCounts = getReportCounts(map, list, id_list.length);

        // 4. 받은 메일 결과 반환
        return getMailCounts(map, list, reportCounts, k);
    }

    @Test
    public void test() {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k = 2;

//        String[] id_list = {"con", "ryan"};
//        String[] report = {"ryan con", "ryan con", "ryan con", "ryan con"};
//        int k = 2;

        Arrays.stream(solution(id_list, report, k)).forEach(System.out::print);// 2 1 1 0
    }


}
