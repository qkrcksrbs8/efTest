package cg.park.testSpringBoot.comm.util;

import java.util.List;

public class NoticeUtil extends Param {

    public NoticeUtil(Param param) {
        super.putAll(param);
    }

    public Param noticeFor(List<String> listStringKey, int value) {
        for(String branchDivision : listStringKey)
            super.set(branchDivision, value);
        return this;
    }
}
