package cg.park.testSpringBoot;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

@SpringBootTest
public class TokenTest {

    @Test
    public void tokenTest() {


        HashMap<String, String> map = new HashMap<>();
        String aaa = map.getOrDefault("item", "");

        System.out.println(aaa);
        System.out.println("success");

        if (1 == 1) {
            return;
        }


        String code = "005";
        if ("05".equals(code.substring(1))) {
            System.out.println(code.substring(1));
        }

        LinkedList<Queue> q = new LinkedList<>();

        String str1 = "/coupon/master";
        String str2 = "/coupon/";

        if (str2.startsWith(str1)) {
            System.out.println("!!!!!!!!!!!!!!!!");
        }

        String data = "N||N|";
        String[] target = data.split("\\|");
        String giftImg = "";
        String programImg = "";

        System.out.println("target.length "+target.length );

        if (target.length == 3) {
            if ((!"Y".equals(target[0]) && !"N".equals(target[0]))
             &&(!"Y".equals(target[2]) && !"N".equals(target[2]))
            ) {
                System.out.println("error not Y/N");
                return;
            }
            if (isY(target[0])) {
                giftImg = target[1];
            }
            System.out.println("giftImg: "+giftImg);
            System.out.println("programImg: "+programImg);
            return;
        }

        if (target.length != 4) {
            System.out.println("오류 발생!");
            return;
        }

        if (isY(target[0])) {
            giftImg = target[1];
        }
        if (isY(target[2])) {
            programImg = target[3];
        }

        System.out.println("giftImg: "+giftImg);
        System.out.println("programImg: "+programImg);

    }

    public boolean isY(String flag) {
        return isBlank(flag) ? false : "Y".equals(flag);
    }

    public boolean isBlank(String str) {
        return null == str || "".equals(str.trim());
    }

}
