package cg.park.testSpringBoot.cote._2022._1005;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class aaaaa {

    @Test
    public void ttt() {

        Box<String> sBox = new Box<>();
        sBox.set("aaaaaaaaaa");

        Box<Box<String>> wBox = new Box<>();
        wBox.set(sBox);

        System.out.println(wBox.getString());

        Box<Box<Box<String>>> zBox = new Box<>();
        zBox.set(wBox);

    }


}

class Box<T> {
    private T ob;

    public void set(T o) {
        ob = o;
    }

    public T get() {
        return ob;
    }

    public T getString() {
        return getString(this);
    }
    private T getString(Box<T> o) {
        return (o.get() instanceof String) ? o.get() : ((Box<T>) this.get()).getString();
    }

}