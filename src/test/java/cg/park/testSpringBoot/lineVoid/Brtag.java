package cg.park.testSpringBoot.lineVoid;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Brtag {

    public String replaceTag(String br) {
        return (br != null) ? br.replace("<", "").replace(">", "") : br;
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
        System.out.println("print: " + br);
        System.out.println("replaceTag: " + replaceTag(br));
        System.out.println("replaceBr: " + replaceBr(br));
        System.out.println("====================test E N D====================");
    }

    @Test
    public void blank() {
        System.out.println("====================blank START====================");
        String br = "";
        System.out.println("print: " + br);
        System.out.println("replaceTag: " + replaceTag(br));
        System.out.println("replaceBr: " + replaceBr(br));
        System.out.println("====================blank E N D====================");
    }

    @Test
    public void whiteSpaceTest() {
        System.out.println("====================whiteSpaceTest START====================");
        String br = "  ";
        System.out.println("print: " + br);
        System.out.println("replaceTag: " + replaceTag(br));
        System.out.println("replaceBr: " + replaceBr(br));
        System.out.println("====================whiteSpaceTest E N D====================");
    }

    @Test
    public void nullTest() {
        System.out.println("====================nullTest START====================");
        String br = null;
        System.out.println("print: " + br);
        System.out.println("replaceTag: " + replaceTag(br));
        System.out.println("replaceBr: " + replaceBr(br));
        System.out.println("====================nullTest E N D====================");
    }
}
