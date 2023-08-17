package cg.park.testSpringBoot._2023;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class workcheck {
    @Test
    public void test() {

    }

    public boolean straightCheck(String password) {
        if (null == password || "".equals(password)) return false;

        // int validationCount = 0;
        // 대문자 포함여부 ++
        // 소문자 포함 여부 ++
        // 숫자 포함 여부 ++
        // 특수문자 포함 여부 ++
        // 4 ? true : false

        int straightCount = 0;
        int straightCountPlus = 0;
        int straightCountMinus = 0;

        char charAt;
        char charAtPlus;

        for (int i = 0; i < password.length(); i++) {
            charAt = password.charAt(i);
            charAtPlus = password.charAt(i+1);

            straightCount = (charAt == charAtPlus) ? straightCount++ : 0;
            if (straightCount > 2) return false;

            straightCountPlus = ((charAt - charAtPlus) == 1) ? straightCountPlus++ : 0;
            straightCountMinus = ((charAt - charAtPlus) == -1) ? straightCountMinus++ : 0;
            if (straightCountPlus > 2 || straightCountMinus > 2) return false;
        }

        return true;
    }
}
