package cg.park.testSpringBoot._2024;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.StringTokenizer;

@SpringBootTest
public class StringParser {

    @Test
    public void test() {

        String test = "|T1|T2";
        String str1 = "";
        String str2 = "";
        try {
            if (null != test || test.indexOf("|") >= 0) {
                StringTokenizer token = new StringTokenizer(test, "|");
                System.out.println("token count: "+token.countTokens());
                token.nextToken();
                str1 = token.nextToken();
                str2 = token.nextToken();
            }
        }
        catch(Exception e) {

        }
        System.out.println("token str1: "+str1);
        System.out.println("token str2: "+str2);

    }
}
