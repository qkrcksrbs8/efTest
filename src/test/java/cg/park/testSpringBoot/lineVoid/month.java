package cg.park.testSpringBoot.lineVoid;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

@SpringBootTest
public class month {

    @Test
    public void print () {

        LocalDate now = LocalDate.now();
        int thisMonth = now.getMonthValue();

        System.out.println(thisMonth);

    }
}
