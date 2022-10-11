package cg.park.testSpringBoot.daos;

import cg.park.testSpringBoot.comm.util.Param;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CodeDao {
    List<Param> selectCode(Param param);
}
