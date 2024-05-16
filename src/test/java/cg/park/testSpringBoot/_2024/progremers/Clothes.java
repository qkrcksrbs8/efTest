package cg.park.testSpringBoot._2024.progremers;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;

@SpringBootTest
public class Clothes {

    @Test
    public void test() {

        String[][] array = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
//        String[][] array = {{"yellowhat", "headgear"}, {"greenturban", "headgear"}, {"bluesunglasses", "eyewear"}};
        System.out.println("result: "+solution(array));

    }

    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> map = new HashMap<>();

        for (String[] arr : clothes)
            map.put(arr[1], map.getOrDefault(arr[1], 0)+1);

        for(String key : map.keySet())
            answer *= (map.get(key) + 1);

        return answer -= 1;
    }

}
