package cg.park.testSpringBoot.lineVoid;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class meaIron {

    @Test
    public void print() {
        B b = new B();
        System.out.println(b.getKey());

    }
}

class A {

    public String getConf(String str) {
        return str;
    }
}

class B extends A {
    private String key = getConf("com.lgcare.lgmembershop.admininfo.decodekey");

    public String getKey() {
        return key;
    }
}
