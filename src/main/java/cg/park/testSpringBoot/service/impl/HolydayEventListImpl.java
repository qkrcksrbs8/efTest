package cg.park.testSpringBoot.service.impl;

import cg.park.testSpringBoot.comm.util.CodeUtil;
import cg.park.testSpringBoot.comm.util.Param;
import cg.park.testSpringBoot.daos.HolydayEventDao;
import cg.park.testSpringBoot.dto.HolydayEvent;
import cg.park.testSpringBoot.service.CommandAbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HolydayEventListImpl extends CommandAbstractService {

    @Autowired
    HolydayEventDao dao;

    @Autowired
    CodeUtil codeUtil;

    public Param preService(Param param) {
        return param.set("code", "S0001");
    }

    public Param postService(Param param) {
        return new Param()
                .set("code", "S0001")
                .set("codes", makeBanner(dao.holydayEventList((String) param.get("GRADE"))));
    }

    public List<HolydayEvent> makeBanner(List<HolydayEvent> list) {
        String type = "";
        List<HolydayEvent> result = new ArrayList<>();
        for (HolydayEvent holy : list) {
            if (containType(type, holy.getType())) {
                type = makeHolydayEventType(holy, result);
                continue;
            }
            result.add(holy);
        }
        return result;
    }

    public String makeHolydayEventType(HolydayEvent holy, List<HolydayEvent> result) {
        holy.setBannerFg("Y");
        result.add(holy);
        return holy.getType();
    }

    public boolean isBlank(String str) {
        return null == str || "".equals(str.trim());
    }

    public boolean containType(String type1, String type2) {
        return !isBlank(type1) && type1.equals(type2);
    }

}
