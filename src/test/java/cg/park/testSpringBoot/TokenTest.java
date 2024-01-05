package cg.park.testSpringBoot;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.SimpleDateFormat;
import java.util.*;

@SpringBootTest
public class TokenTest {


    @Test
    public void print() {

        List<ggg> gs = gggs();

        int count = (int) gs.stream().filter(g -> g.getPrintDate() != null).count();

        System.out.println(count);

        if (1 == 1) return;

        List<ggg> list = gggs();


//        list.sort(Comparator.comparing(ggg::getDeDt).thenComparing(ggg::getDePtm));

        list.sort(Comparator.comparing(ggg::getDeDt).thenComparing(ggg::getDePtm).reversed());

        for (ggg g : list) {
            System.out.println(g.getDeDt() + " " + g.getDePtm());
        }


        if (1 == 1) return;
        Calendar calendar = new GregorianCalendar();
        SimpleDateFormat SDF = new SimpleDateFormat("MM/dd");
        calendar.add(Calendar.DATE, -1);
        String yesterday = SDF.format(calendar.getTime());
        System.out.println("Yesterday : " + yesterday);

        HashMap map1 = new HashMap<>();
        HashMap map2 = new HashMap<>();

//        map1.put("MO_IMG_ALT", "1111");
//        map2.put("MO_IMG", "222");

        map2.putAll(map1);

        if (map2.containsKey("MO_IMG") || map2.containsKey("MO_IMG_ALT")) {
            System.out.println("!!!!!!!!!!!!!!!!!!!!!");
        }



    }

    @Test
    public void tokenTest() {

        String data = "N||Y|";
        String[] target = data.split("\\|");
        if ("Y".equals(target[0]) || "Y".equals(target[2])) {
            System.out.println("!!!!!!!!!!!!!!!!!!!!!");
        }

        if (1==1) return;

        String giftImg = "";
        String programImg = "";

        System.out.println("target.length "+target.length );

        if (target.length == 3) {
            if ((!"Y".equals(target[0]) && !"N".equals(target[0]))
             &&(!"Y".equals(target[2]) && !"N".equals(target[2]))
            ) {
                System.out.println("error not Y/N");
                return;
            }
            if (isY(target[0])) {
                giftImg = target[1];
            }
            System.out.println("giftImg: "+giftImg);
            System.out.println("programImg: "+programImg);
            return;
        }

        if (target.length != 4) {
            System.out.println("���� �߻�!");
            return;
        }

        if (isY(target[0])) {
            giftImg = target[1];
        }
        if (isY(target[2])) {
            programImg = target[3];
        }

        System.out.println("giftImg: "+giftImg);
        System.out.println("programImg: "+programImg);

    }

    public boolean isY(String flag) {
        return isBlank(flag) ? false : "Y".equals(flag);
    }

    public boolean isBlank(String str) {
        return null == str || "".equals(str.trim());
    }

    public List<ggg> gggs () {
        String deDt = "20221108";
        String dePtm = "153522";
        List<ggg> g = new ArrayList<>();
        ggg g3 = new ggg();
        ggg g4 = new ggg();
        g4.setDeDt("20221107");
        g4.setDePtm("113522");
        g.add(g4);
        ggg g2 = new ggg();
        g2.setDeDt("20221108");
        g2.setDePtm("103522");
        g2.setPrintDate("111111");
        g.add(g2);
        g3.setDeDt("20221107");
        g3.setDePtm("153522");
        g3.setPrintDate("22222");
        g.add(g3);
        ggg g1 = new ggg();
        g1.setDeDt("20221108");
        g1.setDePtm("153522");
        g.add(g1);
        return g;
    }

}

class ggg {
    String deDt;
    String dePtm;
    String printDate;

    public String getDeDt() {
        return deDt;
    }

    public void setDeDt(String deDt) {
        this.deDt = deDt;
    }

    public String getDePtm() {
        return dePtm;
    }

    public void setDePtm(String dePtm) {
        this.dePtm = dePtm;
    }

    public String getPrintDate() {
        return printDate;
    }

    public void setPrintDate(String printDate) {
        this.printDate = printDate;
    }
}