package cg.park.testSpringBoot.controller;

import cg.park.testSpringBoot.comm.util.MavUtil;
import cg.park.testSpringBoot.comm.util.NoticeUtil;
import cg.park.testSpringBoot.comm.util.Param;
import cg.park.testSpringBoot.dto.HolydayEvent;
import cg.park.testSpringBoot.service.impl.GradeListImpl;
import cg.park.testSpringBoot.service.impl.HolydayEventListImpl;
import cg.park.testSpringBoot.service.impl.HolydayGiftListImpl;
import cg.park.testSpringBoot.service.impl.SelectNoticeServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.List;

@Controller
public class MainController {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    SelectNoticeServiceImpl selectNoticeService;

    @Autowired
    GradeListImpl gradeList;

    @Autowired
    HolydayEventListImpl holydayEventList;

    @Autowired
    HolydayGiftListImpl holydayGiftList;

    @GetMapping("/")
    public ModelAndView index(HolydayEvent holydayEvent) {

        return new MavUtil()
                .viewName("index")
                .setObject("divisionList"       , selectNoticeService.execute())
                .setObject("gradeList"          , gradeList.execute())
                .setObject("grade"              , holydayEvent.getGrade() == null? "DIAMOND" : holydayEvent.getGrade())
                .setObject("holydayEventList"   , holydayEventList.execute(new Param("GRADE", holydayEvent.getGrade() == null ? "DIAMOND" : holydayEvent.getGrade())));
    }

    @PostMapping("/checkbox")
    public String checkbox(HttpServletRequest request, Model model) {
        logger.info((defaultDbNoticeCode( noticeCodeDao(), Arrays.asList(request.getParameterValues("nb")))).toString());
        return "redirect:/";
    }

    private Param noticeCodeDao() {
        return new Param()
                .set("HD", 0)
                .set("GH", 0)
                .set("SJ", 0);
    }

    private Param defaultDbNoticeCode(Param param, List<String> branchDivisions) {
        return new NoticeUtil(param)
                .noticeFor(branchDivisions, 1);
    }

    @GetMapping("/cookie")
    public ModelAndView cookie() {
        System.out.println("쿠키 진입!!");
        return new MavUtil()
                .viewName("cookie");
    }

    @GetMapping("/giftList")
    public ModelAndView giftList(HolydayEvent holydayEvent) {
        return new MavUtil()
                .viewName("giftList")
                .setObject("gradeList", gradeList.execute())
                .setObject("grade", holydayEvent.getGrade() == null? "SILVER" : holydayEvent.getGrade())
                .setObject("holydayEventList", holydayGiftList.execute(new Param("GRADE", holydayEvent.getGrade() == null ? "SILVER" : holydayEvent.getGrade())));
    }
}
