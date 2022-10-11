package cg.park.testSpringBoot.service.impl;

import cg.park.testSpringBoot.comm.util.CodeUtil;
import cg.park.testSpringBoot.comm.util.Param;
import cg.park.testSpringBoot.daos.CodeDao;
import cg.park.testSpringBoot.service.CommandAbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SelectNoticeServiceImpl extends CommandAbstractService {

    @Autowired
    CodeDao codeDao;

    @Autowired
    CodeUtil codeUtil;

    public Param postService() {
        return new Param()
                .set("code", "S0001")
                .set("codes", codeUtil.getCodes(new Param().set("groupCode", "noticeBranch")));
    }
}
