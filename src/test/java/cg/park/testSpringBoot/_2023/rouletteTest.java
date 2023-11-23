package cg.park.testSpringBoot._2023;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class rouletteTest {

    @Test
    public void test() {

        Integer _eventSeq = 90;
        Integer seq = 0;

        Integer prize = 3;

        System.out.println(result(_eventSeq, prize));

    }

    public String result(Integer _eventSeq, Integer prize) {
        return (_eventSeq == 90)
                ? commRouletteResult(prize, new String[]{"1번 상품", "2번 상품", "3번 상품"})
                : "없음";
    }

    private int rouletteNum(int random, int defaultNum) {
        return (0 == random)
            ? 2
            : (1 == random) ? 5: defaultNum;
    }

    private String commRouletteResult(Integer prize, String[] prizeName) {
        if (prize == null)
            return "꽝" + rouletteNum((int) (Math.random() * 3), 1);

        if (prize == 1)
            return prizeName[0];

        if(prize == 2)
            return prizeName[1];

        return prizeName[2];
    }

}
