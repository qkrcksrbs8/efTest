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
        if (_eventSeq == 90)
            return commRouletteResult(prize, new String[]{"상쾌환 3개입", "빽다방 앗메리카노 HOT", "맥도날드 초코 선데이 아이스크림"});

        return "없음";
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
