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
        // add length check

        int straightCount = 0;
        int straightCountPlus = 0;
        int straightCountMinus = 0;

        char charAt;
        char charAtPlus;

        int passwordCount = password.length();
        for (int i = 0; i < passwordCount; i++) {
            charAt = password.charAt(i);
            charAtPlus = password.charAt(i+1);

            if (charAt == charAtPlus)
                straightCount++;

            if ((charAt - charAtPlus) == 1)
                straightCountPlus++;

            if ((charAt - charAtPlus) == -1)
                straightCountMinus++;
        }

        if (straightCount > 2) {
            // straightCount -> same word count
        }

        if (straightCountPlus > 2 || straightCountMinus > 2) {
            // straightCountPlus, straightCountMinus -> straight word count
        }

        return true;
    }
}
