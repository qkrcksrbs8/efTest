package cg.park.testSpringBoot._2024;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

/* https://school.programmers.co.kr/learn/courses/30/lessons/258712?language=java */
/* 카카오 2023 공채 */
@SpringBootTest
public class _2023kakao_1 {

    HashMap<String, Integer> giftsMap = new HashMap<>();

    @Test
    public void init() {
        String[] friends = {"muzi", "ryan", "frodo", "neo"};
        String[] gifts = {"muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi", "frodo ryan", "neo muzi"};
        solution(friends, gifts);
    }

    public int solution (String [] friends, String[] gifts) {
        int friendsCnt = friends.length;
        int giftsCnt = gifts.length;

        HashMap<String, String> senderMap = new HashMap<>();
        HashMap<String, String> receiverMap = new HashMap<>();
        for (String gift : gifts) {
            String sender = gift.split(" ")[0];
            String receiver = gift.split(" ")[1];
            sortName(sender, receiver, senderMap, true);
            sortName(receiver, sender, receiverMap, false);
        }

        List<String> keySetList = new ArrayList<>(giftsMap.keySet());
        // 내림차순
        Collections.sort(keySetList, (o1, o2) -> (giftsMap.get(o2).compareTo(giftsMap.get(o1))));


        String[] array = senderMap.get(keySetList.get(0)).split(" ");
        Set<String> history = new HashSet<>();
        int score = 0;
        for (String s : array) {
            if (history.contains(s)) continue;
            history.add(s);

            // 내가 선물 보낸 사람이 나에게 안 보냈으면 +1
            if (senderMap.get(s).indexOf(s) == -1) {
                score++;
                continue;
            }




            System.out.println("s: "+s);
        }

        System.out.println("senderMap: "+senderMap);
        System.out.println("receiverMap: "+receiverMap);
        System.out.println("giftsMap: "+giftsMap);
        System.out.println("best user: "+keySetList.get(0)+"|"+giftsMap.get(keySetList.get(0)));

        return score;
    }

    public void sortName(String key, String val, HashMap map, boolean isSend) {
        giftsMap.put(key, giftsMap.getOrDefault(key,0)+ (isSend ? 1 : -1));
        if (map.containsKey(key)) {
            map.put(key, map.get(key)+" "+val);
            return;
        }
        map.put(key, val);
    }

    public int sendCount(HashMap<String, String> senders, String user) {
        String[] subArray = senders.get(user).split(" ");



        return 0;
    }

}
