package cg.park.testSpringBoot;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SumListTest {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Test
    public void sum() {
        logger.info(""+1+1);
    }

    @Test
    public void sum2() {
        logger.info(""+1+2);

        // ȭ�鿡�� ����/���� ���ÿ� ���� ���� ����
        // �����ϸ� ���������� �ٽ� üũ
        //
    }
}
