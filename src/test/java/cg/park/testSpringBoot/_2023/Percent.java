package cg.park.testSpringBoot._2023;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@SpringBootTest
public class Percent {

    @Test
    public void test() {

        List<RouletteCoupon> list = rouletteApplys();

        if (null == list || 0 == list.size()) {
            System.out.println("[E N D] list empty !!!");
            return;
        }

        int totalDailyCount = 0;
        for (RouletteCoupon rc : list) {
            totalDailyCount += Integer.parseInt(rc.getRemnantCount());
            System.out.println("rc.getGift(): "+ rc.getGift() + " rc.getRemnantCount(): "+totalDailyCount);
            rc.setTotalDailyCount(String.valueOf(totalDailyCount));
        }

        Random random = new Random();
        int randomCount = random.nextInt(totalDailyCount) + 1;
        System.out.println("totalCount: "+totalDailyCount);
        System.out.println("randomCount: "+randomCount);

        String gift = "0";

        for (RouletteCoupon rc : list) {
            if (Integer.parseInt(rc.getTotalDailyCount()) >= randomCount) {
                gift = rc.getGift();
                break;
            }
        }

        System.out.println("gift: "+gift);


//        for (int i = 0 ; i < 10; i++) {
//            randomCount = random.nextInt(60) + 1;
//            System.out.println("random: "+ randomCount);
//        }

//        int endCount = 0;

    }

    private List<RouletteCoupon> rouletteApplys() {
        List<RouletteCoupon> list = new ArrayList<>();
        list.add(new RouletteCoupon("1","1","10","20","4","7", "6"));
        list.add(new RouletteCoupon("2","2","10","200","4","4", "6"));
//        list.add(new RouletteCoupon("3","3","500","10000","4","9"));
        list.add(new RouletteCoupon("3","4","3","10","0","1", "3"));
        list.add(new RouletteCoupon("4","5","10","20","4","5", "6"));
        list.add(new RouletteCoupon("5","6","10","20","4","1", "6"));
        list.add(new RouletteCoupon("6","8","5","100","4","1", "1"));
        return list;
    }
}

class RouletteCoupon {
    private String rownum;
    private String gift;
    private String dailyCount;
    private String totalCount;
    private String dcnt;
    private String tcnt;
    private String totalDailyCount;
    private String remnantCount;

    public RouletteCoupon() {}
    public RouletteCoupon(String rownum, String gift, String dailyCount, String totalCount, String dcnt, String tcnt, String remnantCount) {
        this.rownum = rownum;
        this.gift = gift;
        this.dailyCount = dailyCount;
        this.totalCount = totalCount;
        this.dcnt = dcnt;
        this.tcnt = tcnt;
        this.remnantCount = Integer.parseInt(dailyCount) - Integer.parseInt(dcnt) + "";
    }

    public String getRownum() {
        return rownum;
    }

    public void setRownum(String rownum) {
        this.rownum = rownum;
    }

    public String getGift() {
        return gift;
    }

    public void setGift(String gift) {
        this.gift = gift;
    }

    public String getDailyCount() {
        return dailyCount;
    }

    public void setDailyCount(String dailyCount) {
        this.dailyCount = dailyCount;
    }

    public String getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(String totalCount) {
        this.totalCount = totalCount;
    }

    public String getDcnt() {
        return dcnt;
    }

    public void setDcnt(String dcnt) {
        this.dcnt = dcnt;
    }

    public String getTcnt() {
        return tcnt;
    }

    public void setTcnt(String tcnt) {
        this.tcnt = tcnt;
    }

    public String getTotalDailyCount() {
        return totalDailyCount;
    }

    public void setTotalDailyCount(String totalDailyCount) {
        this.totalDailyCount = totalDailyCount;
    }

    public String getRemnantCount() {
        return remnantCount;
    }

    public void setRemnantCount(String remnantCount) {
        this.remnantCount = remnantCount;
    }
}