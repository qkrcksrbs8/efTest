package cg.park.testSpringBoot._2023;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.Field;

@SpringBootTest
public class FieldsTypeCheck {

    @Test
    public void test() throws IllegalAccessException {

        Product p = new Product(1, "CCC", "TTTile", "CCCcontent");
        Object obj = p;
        for (Field field : obj.getClass().getDeclaredFields()) {
            Object value = field.get(obj);
            System.out.println(field.getName() + " " +  field.getType() + " " + value);
//            field.set(obj, "");

        }
    }
}

class Product {
    int seq;
    String name;
    String title;
    String content;

    Product() {}
    Product(int seq, String name, String title, String content) {
        this.seq = seq;
        this.name = name;
        this.title = title;
        this.content = content;
    }

}
