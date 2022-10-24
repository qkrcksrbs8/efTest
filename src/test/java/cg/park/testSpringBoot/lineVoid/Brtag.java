package cg.park.testSpringBoot.lineVoid;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Brtag {

    public void print(String br) {
        System.out.println("print: " + br);
    }

    public void replaceTag(String br) {
        if (br != null) {
            br = br.replace("<", "").replace(">", "");
        }
        System.out.println("replaceTag: " + br);
    }

    public String replaceBr(String br) {
        return replaceSlashBr((br != null && br.indexOf("<br>") > -1) ? br.substring(0, br.indexOf("<br>")) : br);
    }

    public String replaceSlashBr(String br) {
        return (br != null && br.indexOf("</br>") > -1) ? br.substring(0, br.indexOf("</br>")) : br;
    }


    @Test
    public void test() {
        System.out.println("====================test START====================");
        String br = "Well.. </br>hello";
        print(br);
        replaceTag(br);
        System.out.println(replaceBr(br));
        System.out.println("====================test E N D====================");
    }

    @Test
    public void blank() {
        System.out.println("====================blank START====================");
        String br = "";
        print(br);
        replaceTag(br);
        System.out.println(replaceBr(br));
        System.out.println("====================blank E N D====================");
    }

    @Test
    public void whiteSpaceTest() {
        System.out.println("====================whiteSpaceTest START====================");
        String br = "  ";
        print(br);
        replaceTag(br);
        System.out.println(replaceBr(br));
        System.out.println("====================whiteSpaceTest E N D====================");
    }

    @Test
    public void nullTest() {
        System.out.println("====================nullTest START====================");
        String br = null;
        print(br);
        replaceTag(br);
        System.out.println(replaceBr(br));
        System.out.println("====================nullTest E N D====================");
    }
}
