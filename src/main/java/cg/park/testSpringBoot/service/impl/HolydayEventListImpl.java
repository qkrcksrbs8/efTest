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
            if ("".equals(type)) {
                type = holy.getType();
                holy.setBannerFg("Y");
                result.add(holy);
                continue;
            }
            if (!type.equals(holy.getType())) {
                type = holy.getType();
                holy.setBannerFg("Y");
                result.add(holy);
                continue;
            }
            result.add(holy);
        }
        return result;
    }
}
