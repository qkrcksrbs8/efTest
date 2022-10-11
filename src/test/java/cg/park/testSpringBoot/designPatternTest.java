package cg.park.testSpringBoot;


import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class designPatternTest {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Test
    public void designTest() {

        logger.info("====================START==================");



        logger.info("====================E N D==================");
    }
}
