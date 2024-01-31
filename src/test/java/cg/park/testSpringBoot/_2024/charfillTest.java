package cg.park.testSpringBoot._2024;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.StringTokenizer;

@SpringBootTest
public class charfillTest {

    @Test
    public void test() {

        int asciiNumArr[] = {104, 101, 108, 108, 111};

        StringTokenizer token = new StringTokenizer("813&750&680&827&687&834&743&806&701&750&701&757&344&232&", "&");

        //'813&750&680&827&687&834&743&806&701&750&701&757&344&232&' * 7 ) +1

        char[] charArr = new char[token.countTokens()];
        int cnt = 0;
        String s = "";
        while (token.hasMoreTokens()) {
            charArr[cnt] = (char) ((Integer.parseInt(token.nextToken()) -1) /7);
            s += Character.toString(charArr[cnt]);
            cnt++;
        }

        System.out.println("57&50&51&51&99&108&115&114&110&33&49&50&33&");
        System.out.println("57&50&51&51&99&108&115&114&110&33&49&50&33&".replace("&",""));
        System.out.println(s);
    }

}
