package cg.park.testSpringBoot._2024.progremers;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Nullable;
import java.util.HashMap;

@SpringBootTest
public class PhoneBook {

    @Test
    @Nullable
    public void test() {

        System.out.println(solution(new String[]{"119", "97674223", "1195524421"}));
    }

    public boolean solution(String[] phone_book) {
        HashMap<String, String> map = new HashMap<>();

        for (int i = 0; i < phone_book.length; i++)
            map.put(phone_book[i], "");

        for (String pb : phone_book)
            for (int i = 1; i < pb.length(); i++)
                if (map.containsKey(pb.substring(0, i)))
                    return false;

        return true;
    }
}
