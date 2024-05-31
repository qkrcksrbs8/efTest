package cg.park.testSpringBoot._2024;

import cg.park.testSpringBoot.comm.util.Param;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class subList {

    @Test
    public void test() {

        List<Param> list = getList();


        List<Param> list2 = list.subList(5,10);
        list = list.subList(0, 5);

        for (int i = 0; i < list.size(); i++) {
            System.out.println("P: "+list.get(i).get("name") + " | M: "+list2.get(i).get("name"));
        }

    }

    public List<Param> getList() {
        List<Param> list = new ArrayList<>();
        list.add(new Param("name", "1"));
        list.add(new Param("name", "2"));
        list.add(new Param("name", "3"));
        list.add(new Param("name", "4"));
        list.add(new Param("name", "5"));
        list.add(new Param("name", "6"));
        list.add(new Param("name", "7"));
        list.add(new Param("name", "8"));
        list.add(new Param("name", "9"));
        list.add(new Param("name", "10"));
        return list;
    }

}
