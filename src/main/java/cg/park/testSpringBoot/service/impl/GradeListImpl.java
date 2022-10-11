package cg.park.testSpringBoot.service.impl;

import cg.park.testSpringBoot.comm.util.Param;
import cg.park.testSpringBoot.daos.HolydayEventDao;
import cg.park.testSpringBoot.service.CommandAbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GradeListImpl extends CommandAbstractService {

    @Autowired
    HolydayEventDao dao;

    public Param postService() {
        return new Param()
                .set("code", "S0001")
                .set("codes", dao.gradeList());
    }
}
