package cg.park.testSpringBoot.service;

import cg.park.testSpringBoot.comm.util.Param;
import org.springframework.stereotype.Service;

@Service
public abstract class CommandAbstract {

    public Param execute() {
        return postService();
    }

    public Param execute(Param param) {
        Param preResult = preService(param);
        if (!isSuccessCode(preResult)) return preResult;
        return postService(preResult);
    }

    public boolean isSuccessCode(Param param) {
        return (param.getOrDefault("code", "E0001").equals("S0001"));
    }

    public abstract Param preService(Param param);
    public abstract Param postService(Param param);
    public abstract Param postService();
}
