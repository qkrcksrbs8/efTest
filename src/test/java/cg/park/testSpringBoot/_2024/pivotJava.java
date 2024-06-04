package cg.park.testSpringBoot._2024;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.HashMap;

@SpringBootTest
public class pivotJava {

    @Test
    public void test() {

        ArrayList<HashMap<String, String>> dateList = date();
        ArrayList<HashMap<String, String>> listByDate = listByDate();
        ArrayList<HashMap<String, String>> dpids = dpid();

        for (HashMap<String, String> m : listByDate) {
            System.out.println("m: "+m);
        }

        int j = 0;
        String dayQty = "0";
        for (HashMap<String, String> row : dpids) {

            j = 0;
            for (int i = 0; i < dateList.size(); i++) {
                dayQty = "0";
                if (dateList.get(i).get("days").equals(listByDate.get(j).get("days"))) {
                    while (dateList.get(i).get("days").equals(listByDate.get(j).get("days"))) {

                        if (row.get("dpid").equals(listByDate.get(j).get("dpid"))) {
                            dayQty = listByDate.get(j).get("qty");
                        }
                        if (null != listByDate.get(j).get("dpid") || !"".equals(listByDate.get(j).get("dpid")))
                            j++;
                    }
                }
                System.out.print("dayQty("+i+" | "+j+"): "+dayQty + " | ");
            }
            System.out.println("");
        }

    }

    public ArrayList<HashMap<String, String>> dpid() {
        ArrayList<HashMap<String, String>> list = new ArrayList<>();

        String[] arr = new String[]{"AF002473", "AF003108", "AF004639", "AF004657", "AF004680", "AF005395", "AF007912"};
        for (String a : arr) {
            HashMap<String, String> map = new HashMap<>();
            map.put("dpid", a);
            list.add(map);
        }
        return list;
    }

    public ArrayList<HashMap<String, String>> date() {
        ArrayList<HashMap<String, String>> list = new ArrayList<>();

        String[] arr = new String[]{"2023.01.01","2023.01.02","2023.01.03","2023.01.04","2023.01.05","2023.01.06","2023.01.07","2023.01.08","2023.01.09","2023.01.10"};
        for (String a : arr) {
            HashMap<String, String> map = new HashMap<>();
            map.put("days", a);
            list.add(map);
        }
        return list;
    }

    public ArrayList<HashMap<String, String>> listByDate() {
        ArrayList<HashMap<String, String>> list = new ArrayList<>();

        String[] arr1 = new String[]{"2023.01.06","2023.01.06","2023.01.06","2023.01.06","2023.01.06","2023.01.06","2023.01.06","2023.01.07","2023.01.08","2023.01.09","2023.01.10"};
        String[] arr2 = new String[]{"1","3","2","3","4","1","8","0","0","0","1",};
        String[] arr3 = new String[]{"AF004680", "AF004657", "AF003108", "AF004639", "AF005395", "AF002473", "AF007912", "", "", "", "AF004657"};
        for (int i = 0; i < arr1.length; i++) {
            HashMap<String, String> map = new HashMap<>();
            map.put("days", arr1[i]);
            map.put("qty", arr2[i]);
            map.put("dpid", arr3[i]);
            list.add(map);
        }
        return list;
    }
}
