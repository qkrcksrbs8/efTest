package cg.park.testSpringBoot;

import cg.park.testSpringBoot.comm.util.Param;
import cg.park.testSpringBoot.service.impl.MealServiceImpl;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CommandAbstractTest {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    MealServiceImpl mealService;

    @Test
    public void executeParamTest() {
        Param param = mealService.execute();
        logger.info(param.toString());
    }
}
