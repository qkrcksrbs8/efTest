package cg.park.testSpringBoot._2023;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.StringTokenizer;

@SpringBootTest
public class AES256Test {

    @Test
    public void test() throws Exception {
        String name = "chase";
        String phone1 ="010";
        String phone2 = "3921";
        String phone3 = "9258";
        StringBuffer sb = new StringBuffer();
        sb
            .append(name).append(" ")
            .append(phone1).append(" ")
            .append(phone2).append(" ")
            .append(phone3);

        AES256 aes256 = new AES256();
        String cipherText = aes256.encrypt(sb.toString());// 44
        String decodeText = aes256.decrypt(cipherText);
        System.out.println(sb);
        System.out.println(cipherText + " " + cipherText.length());
        System.out.println(decodeText);

        System.out.println("");
        StringTokenizer token = new StringTokenizer(decodeText, " ");
        while(token.hasMoreTokens())
            System.out.println(token.nextToken());
    }
}
