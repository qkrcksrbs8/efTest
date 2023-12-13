package cg.park.testSpringBoot._2023;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class logiccalTest {

    @Test
    public void test () {
        String stampCode = "S01";
        if (!("S01".equals(stampCode) || "S02".equals(stampCode)
                || "S03".equals(stampCode) ||"S04".equals(stampCode)
                || "S05".equals(stampCode) || "S06".equals(stampCode))
        ) {
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        }

        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@");

    }

    @Test
    public void test2 () {
        String str1 = "/list";
        String str2 = "/WEB-INF/views/list.jsp";

        System.out.println("============================================================");
        System.out.println(replaceJsp(str1));
        System.out.println(replaceJsp(str2));
        System.out.println("============================================================");
    }

    public String replaceJsp (String str) {
        return str
                .replace("/pc", "k")
                .replace("/mo", "k")
                .replace(".jsp", "");
    }

}
