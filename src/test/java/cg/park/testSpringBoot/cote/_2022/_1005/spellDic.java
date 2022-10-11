package cg.park.testSpringBoot.cote._2022._1005;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class spellDic {

    @Test
    public void space() {
        String[] spell = {"p", "o", "s"};
        String[] dic = {"sod", "eocd", "qixm", "adio", "soo"};
        int result = solution(spell, dic);

        System.out.println("===========START===========");
        System.out.println(result);
        System.out.println("===========E N D===========");
    }

    public int solution(String[] spell, String[] dic) {
        for (String word : dic) {
            if (isSpellCheck(word, spell)) return 1;
        }
        return 2;
    }

    public boolean isSpellCheck (String word, String[] spell) {
        for (String remove : spell) {
            if (word.indexOf(remove) == -1) return false;
        }
        return true;
    }
}
