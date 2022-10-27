package cg.park.testSpringBoot.cote._2022.programmers.search;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashSet;

@SpringBootTest
public class Minority {

    HashSet<Integer> set = new HashSet<>();

    public boolean isPrime(int num) {
        if (num < 2) return false;

        int limit = (int) Math.sqrt(num);

        for (int i = 2; i <= limit; i++)
            if (num % i == 0)
                return false;

        return true;
    }

    public void setCom(String com) {
        if (!"".equals(com)) set.add(Integer.parseInt(com));
    }

    public void createdNumber(String com, String numbers) {
        setCom(com);
        for (int i = 0; i < numbers.length(); i++) {
            setCom(com);
            createdNumber(com + numbers.charAt(i), numbers.substring(0, i) + numbers.substring(i+1));
        }
    }

    public int solution(String numbers) {
        // 1. 모든 수의 조합 생성
        createdNumber("", numbers);

        // 2. 소수 갯수 반환
        return (int) set.stream().filter(n -> isPrime(n)).count();
    }

    @Test
    public void print() {
        String numbers = "1231";
        System.out.println(solution(numbers));
    }
}
