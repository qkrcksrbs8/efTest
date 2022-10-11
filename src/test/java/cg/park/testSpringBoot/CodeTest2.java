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

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootTest
public class CodeTest2 {
    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    CodeDao codeDao;

    @Autowired
    CodeUtil codeUtil;

    @Autowired
    SelectNoticeServiceImpl selectNoticeService;

    @Test
    public void selectCodeTest() {



//        String dd = String.format("%02d", LocalDate.now().getDayOfMonth());
//        System.out.println("======");
//        System.out.println(dd);
//        System.out.println("======");

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
        List<String> list = setStringList();
        List<String> listSet =
                list.stream()
                .distinct()
                .collect(Collectors.toList());
        listSet.forEach(System.out::println);

    }

    public List<String> setStringList() {
        List<String> list = new ArrayList<>();
        list.add("10");
        list.add("2");
        list.add("1");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("4");
        list.add("3");
        list.add("2");
        list.add("6");
        list.add("1");
        list.add("1");
        list.add("1");
        list.add("1");
        list.add("1");

        return list;
    }

    public List<Mypage>  setMypage() {
        List<Mypage> list = new ArrayList<>();
        Mypage mypage = new Mypage();
        mypage.setCouponMasterIndexno("10");
        list.add(mypage);
        mypage = new Mypage();
        mypage.setCouponMasterIndexno("1");
        list.add(mypage);
        mypage = new Mypage();
        mypage.setCouponMasterIndexno("1");
        list.add(mypage);
        mypage = new Mypage();
        mypage.setCouponMasterIndexno("1");
        list.add(mypage);
        mypage = new Mypage();
        mypage.setCouponMasterIndexno("2");
        list.add(mypage);
        mypage = new Mypage();
        mypage.setCouponMasterIndexno("2");
        list.add(mypage);
        mypage = new Mypage();
        mypage.setCouponMasterIndexno("3");
        list.add(mypage);
        mypage = new Mypage();
        mypage.setCouponMasterIndexno("4");
        list.add(mypage);
        mypage = new Mypage();
        mypage.setCouponMasterIndexno("4");
        list.add(mypage);
        mypage = new Mypage();
        mypage.setCouponMasterIndexno("4");
        list.add(mypage);
        mypage = new Mypage();
        mypage.setCouponMasterIndexno("10");
        list.add(mypage);
        mypage = new Mypage();
        mypage.setCouponMasterIndexno("2");
        list.add(mypage);
        return list;
    }





}
