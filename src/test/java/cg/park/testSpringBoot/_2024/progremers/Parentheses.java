package cg.park.testSpringBoot._2024.progremers;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Stack;

@SpringBootTest
public class Parentheses {

    @Test
    public void test() {

    }

    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if ('(' == s.charAt(i)) {
                stack.add(s.charAt(i));
                continue;
            }

            if (stack.isEmpty()) return false;
            stack.pop();
        }

        return stack.isEmpty();
    }

}
