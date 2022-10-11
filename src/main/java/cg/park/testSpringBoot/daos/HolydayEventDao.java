package cg.park.testSpringBoot.daos;

import cg.park.testSpringBoot.dto.HolydayEvent;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface HolydayEventDao {
    List<HolydayEvent> gradeList();
    List<HolydayEvent> holydayEventList(String grade);

    List<HolydayEvent> holydayGiftList(String grade);
}
