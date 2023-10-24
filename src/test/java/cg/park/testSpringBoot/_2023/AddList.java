package cg.park.testSpringBoot._2023;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class AddList {

    @Test
    public void test() {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");


        List<String> list2 = new ArrayList<>();
        list2.add("3");
        list2.add("4");

        list.addAll(list2);

        System.out.println("size: "+list.size());

    }
}
