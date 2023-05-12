package cg.park.testSpringBoot._2023;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class logiccalTest {

    @Test
    public void test () {
        String stampCode = "STAMP001";
        if (!("STAMP001".equals(stampCode) || "STAMP002".equals(stampCode)
                || "STAMP003".equals(stampCode) ||"STAMP004".equals(stampCode)
                || "STAMP005".equals(stampCode) || "STAMP006".equals(stampCode))
        ) {
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        }

        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@");

    }

    @Test
    public void test2 () {
        String str1 = "/kor/enjoy/event/list";
        String str2 = "/WEB-INF/views/pc/enjoy/event/list.jsp";

        System.out.println("============================================================");
        System.out.println(replaceJsp(str1));
        System.out.println(replaceJsp(str2));
        System.out.println("============================================================");
    }

    public String replaceJsp (String str) {
        return str
                .replace("WEB-INF/views/pc", "kor")
                .replace("WEB-INF/views/mo", "kor")
                .replace(".jsp", "");
    }

}
