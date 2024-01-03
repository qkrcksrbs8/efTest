package cg.park.testSpringBoot;

import cg.park.testSpringBoot.comm.util.Param;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TimeCheck {


    @Test
    public void print() {

        Param sr = new Param();
        sr.set("price", "2727");
        sr.set("amt", "34000");

        String np = (String) sr.get("price");
        if (null == np || "".equals(np)){
            np = "0";
        }

        int shipAmt = Integer.parseInt((String)sr.get("amt"));
        np = (Integer.parseInt(np) + (shipAmt/3))+"";

        System.out.println("price: "+sr.get("price"));
        System.out.println("amt: "+shipAmt);
        System.out.println("amt/3: "+shipAmt/3);
        System.out.println("price + (amt / 3): "+np);
//
//
//        String uuidDate = "2022:12:01:13:15";
//        String toDate = "2022:12:01:13:21";
//
//        String[] u = uuidDate.split(":");
//        String[] t = toDate.split(":");
//        if (u.length != 5 || t.length != 5){
//            System.out.println("u.length: "+u.length + " | t.length: "+t.length);
//            return;
//        }
////        if (!u[0].equals(t[0])) return null;
////        if (!u[1].equals(t[1])) return null;
////        if (!u[2].equals(t[2])) return null;
//        int um = (Integer.parseInt(u[3]) * 60) + Integer.parseInt(u[4]);
//        int tm = (Integer.parseInt(t[3]) * 60) + Integer.parseInt(t[4]);
//        int time = tm - um;
//        if (0 > time || time > 5) {
//            System.out.println(time);
//            return;
//        }
//
//        System.out.println("Success");
    }

}