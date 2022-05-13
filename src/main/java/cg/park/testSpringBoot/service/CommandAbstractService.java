package cg.park.testSpringBoot.service;

import cg.park.testSpringBoot.comm.util.Param;

public class CommandAbstractService extends CommandAbstract{

    public Param preService(Param param) {
        return new Param().code("P0001");
    }
    public Param postService(Param param) {
        return new Param().code("P0001");
    }
    public Param postService() { return new Param().code("P0001"); }
}
