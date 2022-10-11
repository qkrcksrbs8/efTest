package cg.park.testSpringBoot.comm.util;

import cg.park.testSpringBoot.daos.CodeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class CodeUtil {

    @Autowired
    CodeDao codeDao;

    public List<Param> getCodes(Param groupCode) {
        List<Param> codeDaos = codeDao.selectCode(groupCode);
        return codeDaos;
    }

}
