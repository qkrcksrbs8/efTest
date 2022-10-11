package cg.park.testSpringBoot;

import cg.park.testSpringBoot.comm.util.CodeUtil;
import cg.park.testSpringBoot.comm.util.Param;
import cg.park.testSpringBoot.daos.CodeDao;
import cg.park.testSpringBoot.service.impl.SelectNoticeServiceImpl;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.SimpleDateFormat;
import java.util.*;

@SpringBootTest
public class CodeTest {
    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    CodeDao codeDao;

    @Autowired
    CodeUtil codeUtil;

    @Autowired
    SelectNoticeServiceImpl selectNoticeService;

    @Test
    public void selectCodeTest() {
        List<Param> list  = codeDao.selectCode(new Param().set("groupCode", "noticeBranch"));
        logger.info(list.toString());
    }

    @Test
    public void selectCodeUtilTest() {
        List<Param> param =  codeUtil.getCodes(new Param().set("groupCode", "noticeBranch"));
        logger.info(param.toString());
    }

    @Test
    public void selectNoticeServiceTest() {
        toStringLog(selectNoticeService.execute());
    }

    public void toStringLog(Param param) {
        logger.info(param.toString());
    }

    @Test
    public void pcg() {
        List<Mypage> list = setMypage();
        HashMap<String, Object> map = new HashMap<>();

        List<Mypage> mypages = new ArrayList<>();
        List<Mypage> noImg = new ArrayList<>();
        List<List<Mypage>> result = new ArrayList<>();
        Mypage m = new Mypage();
        String masterno = "";

        for (Mypage mypage : list) {
            if ("".equals(mypage.getTitle())) {
                noImg.add(mypage);
                continue;
            }
            if (masterno.equals(mypage.getCouponMasterIndexno())) {
                mypages.add(mypage);
                continue;
            }
            if (0 == mypages.size()) {
                masterno = mypage.getCouponMasterIndexno();
                mypages.add(mypage);
                continue;
            }
            result.add(mypages);
            masterno = mypage.getCouponMasterIndexno();
            mypages = new ArrayList<>();
            mypages.add(mypage);
        }
        result.add(mypages);

        map.put("myCouponList", result);

        List<List<Mypage>> listTest = (List<List<Mypage>>) map.get("myCouponList");

        for (List<Mypage> subList : listTest) {
            for (Mypage print : subList) {
                System.out.println(print.getCouponMasterIndexno()+ " "+print.getTitle());
            }
            System.out.println("------------------");
        }

        for (Mypage noimgPrint : noImg) {
            System.out.println(noimgPrint.getCouponMasterIndexno()+ " "+noimgPrint.getTitle());
        }

    }
    
    public List<Mypage>  setMypage() {
        List<Mypage> list = new ArrayList<>();
        Mypage mypage = new Mypage();
        mypage.setCouponMasterIndexno("1");
        mypage.setTitle("IMG1");
        list.add(mypage);
        mypage = new Mypage();
        mypage.setCouponMasterIndexno("1");
        mypage.setTitle("IMG1");
        list.add(mypage);
        mypage = new Mypage();
        mypage.setCouponMasterIndexno("1");
        mypage.setTitle("IMG1");
        list.add(mypage);
        mypage = new Mypage();
        mypage.setCouponMasterIndexno("2");
        mypage.setTitle("");
        list.add(mypage);
        mypage = new Mypage();
        mypage.setCouponMasterIndexno("2");
        mypage.setTitle("");
        list.add(mypage);
        mypage = new Mypage();
        mypage.setCouponMasterIndexno("3");
        mypage.setTitle("IMG3");
        list.add(mypage);
        mypage = new Mypage();
        mypage.setCouponMasterIndexno("4");
        mypage.setTitle("IMG4");
        list.add(mypage);
        mypage = new Mypage();
        mypage.setCouponMasterIndexno("4");
        mypage.setTitle("IMG4");
        list.add(mypage);
        mypage = new Mypage();
        mypage.setCouponMasterIndexno("4");
        mypage.setTitle("IMG4");
        list.add(mypage);
        mypage = new Mypage();
        return list;
    }

    @Test
    public void dateCheck() {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat ("yyyyMMdd");
            Date date1 = dateFormat.parse("20220714");
            Date date2 = dateFormat.parse("20220715");
            System.out.println("Date-1: " + dateFormat.format(date1));
            System.out.println("Date-2: " + dateFormat.format(date2));
            Date dDate = new Date();
            System.out.println("toDay: " +dateFormat.format(new Date(dDate.getTime()+(1000*60*60*24*30))));
            if(date1.before(date2)){
                System.out.println("Date-1 is before Date-2");
            }

        } catch (Exception e) {

        }
    }


}

class Mypage {
    private String couponMasterIndexno;
    private String title;

    public String getCouponMasterIndexno() {
        return couponMasterIndexno;
    }

    public void setCouponMasterIndexno(String couponMasterIndexno) {
        this.couponMasterIndexno = couponMasterIndexno;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
