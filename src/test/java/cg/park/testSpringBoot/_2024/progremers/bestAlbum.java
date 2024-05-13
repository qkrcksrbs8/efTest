package cg.park.testSpringBoot._2024.progremers;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

@SpringBootTest
public class bestAlbum {

    @Test
    public void test() {
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};
        System.out.println(solution(genres, plays));
    }

    public int[] solution(String[] genres, int[] plays) {
        HashMap<String, ArrayList<Integer>> map = new HashMap<>();
        ArrayList list;
        HashMap<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < genres.length; i++) {
            indexMap.put(plays[i], i);
            String g = genres[i];
            int p = plays[i];
            if (null == map.get(g)) {
                list = new ArrayList();
                list.add(p);
                map.put(g, list);
                continue;
            }

            list = map.get(g);
            list.add(p);
            map.put(g, list);
        }

        HashMap<Integer, String> sortMap = new HashMap<>();
        ArrayList<Integer> sortList = new ArrayList<>();

        for (Map.Entry<String, ArrayList<Integer>> l : map.entrySet()) {
            list = l.getValue();
            Collections.sort(list, Collections.reverseOrder());
            System.out.println(l.getKey() + ": "+list.get(0));
            sortMap.put((Integer) list.get(0), l.getKey());
            sortList.add((Integer) list.get(0));
        }

        Collections.sort(sortList, Collections.reverseOrder());
        ArrayList<Integer> result = new ArrayList<>();
        for (Integer i : sortList) {
            ArrayList<Integer> subList = map.get(sortMap.get(i));
            int cnt = 2 < subList.size() ? 2 : subList.size();
            for (Integer j : subList.subList(0,cnt))
                result.add(indexMap.get(j));
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }

}
