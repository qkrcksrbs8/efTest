package cg.park.testSpringBoot.service.impl;

import cg.park.testSpringBoot.comm.util.CodeUtil;
import cg.park.testSpringBoot.comm.util.Param;
import cg.park.testSpringBoot.daos.HolydayEventDao;
import cg.park.testSpringBoot.service.CommandAbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HolydayGiftListImpl extends CommandAbstractService {

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
                .set("codes", dao.holydayGiftList((String) param.get("GRADE")));
    }

}
