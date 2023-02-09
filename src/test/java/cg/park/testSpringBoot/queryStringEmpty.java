package cg.park.testSpringBoot;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class queryStringEmpty {

    @Test
    public void test() {

        String str1 = "title=a&pageNum=1&detail=1";
        String str2 = "title=a&pageNum=1";
        String str3 = "pageNum=1&detail=1";
        String str4 = "pageNum=1";
        String str5 = null;
        String str6 = "";
        String str7 = " ";

        System.out.println(str1 + "=> "+replaceQueryString(str1));
        System.out.println(str2 + "=> "+replaceQueryString(str2));
        System.out.println(str3 + "=> "+replaceQueryString(str3));
        System.out.println(str4 + "=> "+replaceQueryString(str4));
        System.out.println(str5 + "=> "+replaceQueryString(str5));
        System.out.println(str6 + "=> "+replaceQueryString(str6));
        System.out.println(str7 + "=> "+replaceQueryString(str7));

    }

    public String replaceQueryString(String str) {
        if (null == str || "".equals(str.trim()))
            return "";

        int num = str.indexOf("pageNum=");
        if (-1 == num)
            return str;

        if (num != 0 && "&".equals(str.substring(num-1, num)))
            return str.substring(0, num-1) + str.substring(num+9);

        if (num == 0 && str.substring(num+9).startsWith("&"))
            return str.substring(num+10);

        return str.substring(0, num) + str.substring(num+9);
    }

}
