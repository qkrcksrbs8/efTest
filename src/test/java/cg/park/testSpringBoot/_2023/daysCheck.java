package cg.park.testSpringBoot._2023;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class daysCheck {

    @Test
    public void test() {
        String startDate = "20230809";
        String endDate = "20230831";
        String today = "20231101";

        String pw = "20231001";

        if (today.compareTo(pw) > 0) {
            System.out.println("!!!!!!!!");
        }

//        if (startDate.compareTo(today) <= 0 && endDate.compareTo(today) >= 0) {
//            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!");
//        }
//
//        String newDate = "20231111";
//
//        if (newDate.compareTo(today) > 0) {
//            System.out.println("@@@@@@@@@@@@@@@@@@@@");
//        }

    }

}



//********************************************************************************************
//        (ex)tableName: checkDateTable
//        *연속 출첵 일자 구하기. 연속출첵 이벤트
//        - 추출조건: 5회 이상 연속출첵, 1월1일 ~ 2월28일
//        SELECT DISTINCT mem_id, max(straightDate)
//        FROM (
//        SELECT
//        mem_id,
//        COUNT(*) AS straightDate
//        FROM (
//        SELECT mem_id, days, TO_NUMBER(days)-ROWNUM AS rnum
//        FROM (
//        SELECT TO_CHAR(base + LEVEL - 1, 'yyyyMMdd') days
//        FROM (SELECT TO_DATE('20230101', 'yyyyMMdd') base FROM DUAL)
//        CONNECT BY base + LEVEL - 1 <= TO_DATE('20230228', 'yyyyMMdd')
//        ) a, (
//        SELECT mem_id, check_date
//        FROM checkDateTable a
//        WHERE check_date >= '20230101'
//        AND check_date <= '20230228'
//        ) b
//        WHERE a.days = b.check_date(+)
//        )
//        HAVING mem_id IS NOT NULL
//        GROUP BY mem_id, rnum
//        ORDER BY straightDate DESC
//        )
//        WHERE straightDate >= 5
//        GROUP BY mem_id
//        ;
//
//        *******************************************************************************