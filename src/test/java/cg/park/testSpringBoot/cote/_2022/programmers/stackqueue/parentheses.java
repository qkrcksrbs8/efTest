package cg.park.testSpringBoot.cote._2022.programmers.stackqueue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Stack;

@SpringBootTest
public class parentheses {

    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ('(' == c) {
                stack.add(c);
                continue;
            }
            if (')' == c) {
                if (stack.empty()) return false;
                stack.pop();
                continue;
            }
        }
        return stack.empty();
    }

    @Test
    public void print() {
//        String s = "()()";	 //true
//        String s = "(())()"; //true
//        String s = ")()(";	 //false
        String s = "(()(";	 //false
        System.out.println(solution(s));
    }

}
