package cg.park.testSpringBoot._2024;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;

@SpringBootTest
public class JsonToMap {

    @Test
    public void test() {
        String result = "{\"id\":3242030878,\"connected_at\":\"2023-12-26T05:30:58Z\",\"properties\":{\"nickname\":\"PCG\"},\"kakao_account\":{\"profile_nickname_needs_agreement\":false,\"profile\":{\"nickname\":\"PCG\",\"is_default_nickname\":false}}}";
//        String result = "{\"properties\":{\"nickname\":\"PCG\"},\"kakao_account\":{\"profile_nickname_needs_agreement\":false,\"profile\":{\"nickname\":\"PCG\",\"is_default_nickname\":false}}}";
        System.out.println(result);

        String key = "";
        String value = result;
        HashMap<String, String> map = new HashMap<>();

        while (value.indexOf(":") > -1) {

            key = value.substring(0, value.indexOf(":"));
            value = value.substring(value.indexOf(":")+1);

            if (value.startsWith("{")) {
                map.put(startEndCut(key), startEndCut(value.substring(0, value.indexOf("}"))));

                System.out.println("key: "+ startEndCut(key));
                System.out.println("value: "+startEndCut(value.substring(0, value.indexOf("}"))));

                value = value.substring(value.indexOf("}")+1);

            }
            else {
                map.put(startEndCut(key), startEndCut(value.substring(0, value.indexOf(","))));
                System.out.println("key: "+ startEndCut(key));
                System.out.println("value: "+startEndCut(value.substring(0, value.indexOf(","))));
                value = value.substring(value.indexOf(",")+1);

            }
        }

        System.out.println("map: "+map);
    }

    public String startEndCut(String str) {
        if (isBlank(str)) return "";
        if (str.startsWith("{")) str = str.substring(1);
        if (str.startsWith(",")) str = str.substring(1);
        if (str.endsWith("}")) str = str.substring(0, str.length()-1);
        return str;
    }

    public boolean isBlank(String str) {
        return null == str || "".equals(str.trim());
    }
}
