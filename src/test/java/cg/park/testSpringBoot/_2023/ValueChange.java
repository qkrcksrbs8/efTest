package cg.park.testSpringBoot._2023;

import cg.park.testSpringBoot.comm.util.Param;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ValueChange {

    @Test
    public void test() {
        Param param = new Param();
        String codeA = "";

        param.set("site", "A");
        codeA = "A";
        print(param, codeA, true);

        param.set("site", "B");
        codeA = "A";
        print(param, codeA, true);

        param.set("point", "Y");
        param.set("site", "A");
        codeA = "A";
        print(param, codeA, true);

        param.set("point", "Y");
        param.set("site", "B");
        codeA = "A";
        print(param, codeA, true);

        param.set("point", "Y");
        param.set("site", "A");
        codeA = "A";
        print(param, codeA, false);

        param.set("point", "Y");
        param.set("site", "B");
        codeA = "A";
        print(param, codeA, false);
    }

    public void print(Param paramA, String codeA, boolean check) {
        Param paramB = new Param();
        paramB.set("code", "Y".equals(paramA.get("point"))? "case1" : "case2");

        if(codeA.equals(paramA.get("site")) && check) {
            paramB.set("code", "case3");
        }

        System.out.println(paramB.get("code"));
        // case3
        // case2
        // case3
        // case1
        // case1
        // case1
    }
}
