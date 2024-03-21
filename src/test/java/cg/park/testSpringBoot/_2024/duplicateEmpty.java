package cg.park.testSpringBoot._2024;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.HashMap;

@SpringBootTest
public class duplicateEmpty {

    @Test
    public void test() {

        ArrayList<HashMap<String, String>> list = findList(5);

        ArrayList<HashMap<String, String>> list2 = findList2(6);

        System.out.println(list);
        System.out.println(" ############################################################ ");
        System.out.println(list2);

        int count = 0;
        HashMap<String, String> check = new HashMap<>();
        for (HashMap<String, String> m : list) {
            if (check.containsKey(m.get("item"))) continue;
            check.put(m.get("item"), "item");
            count++;
        }

        System.out.println("count: "+count);
        for (int i = count; i < list2.size(); i++)
            list.add(list2.get(count));

        System.out.println("list :"+list);

    }

    public ArrayList<HashMap<String, String>> findList(int cnt) {
        ArrayList<HashMap<String, String>> list = new ArrayList<>();

        for (int i = 1; i < cnt; i++) {
            HashMap<String, String> map = new HashMap<>();
            map.put("item", i+"");
            list.add(map);

            HashMap<String, String> map2 = new HashMap<>();
            map.put("item", i+"");
            list.add(map);

            HashMap<String, String> map3 = new HashMap<>();
            map.put("item", i+"");
            list.add(map);
        }
        return list;
    }

    public ArrayList<HashMap<String, String>> findList2(int cnt) {
        ArrayList<HashMap<String, String>> list = new ArrayList<>();

        for (int i = 1; i < cnt; i++) {
            HashMap<String, String> map = new HashMap<>();
            map.put("item", i+"");
            list.add(map);
        }
        return list;
    }

}
