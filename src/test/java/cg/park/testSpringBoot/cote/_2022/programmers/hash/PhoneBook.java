package cg.park.testSpringBoot.cote._2022.programmers.hash;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.Comparator;

@SpringBootTest
public class PhoneBook {

    public boolean solution(String[] phone_book) {
        int size = phone_book.length;
        if (size < 2) return true;
        Arrays.sort(phone_book, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });

        for (int i = 0; i < size; i++)
            for (int j = i+1; j < size; j++)
                if (phone_book[i].equals(phone_book[j].substring(0, phone_book[i].length()))) return false;

        return true;
    }


    @Test
    public void print() {
        String[] phoneBook = {"111113", "1112","12"};
        System.out.println(solution(phoneBook));

    }

}
