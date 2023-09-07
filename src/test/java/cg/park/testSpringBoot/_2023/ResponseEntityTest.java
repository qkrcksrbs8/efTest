package cg.park.testSpringBoot._2023;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@SpringBootTest
public class ResponseEntityTest {

    @Test
    public void test() {
        ttt();
    }


    public void ttt () {
        aa a = new aa();
        a.setA("111");
        a.setB("222");
        ResponseEntity<aa> b = new ResponseEntity<>(a, HttpStatus.OK);

        System.out.println(b.getBody());
        System.out.println(b.getBody().toString());

    }

}


class aa {
    String a= "a";
    String b = "b";

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "aa.toString()!!!!";
    }
}