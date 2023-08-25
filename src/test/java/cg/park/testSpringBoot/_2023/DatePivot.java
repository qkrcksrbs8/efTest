package cg.park.testSpringBoot._2023;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DatePivot {

    @Test
    public void test() {
//        SELECT *
//                FROM (
//                        SELECT sale_date, product_id, name, amount
//        FROM (
//                select TO_DATE('2023.08.01', 'YYYY.MM.DD') sale_date, 1 product_id, '1번상품' name , 100 amount from dual union all
//                select TO_DATE('2023.08.01', 'YYYY.MM.DD') sale_date, 1 product_id, '1번상품' name , 100 amount from dual union all
//                select TO_DATE('2023.08.01', 'YYYY.MM.DD') sale_date, 2 product_id, '2번상품' name , 10 amount from dual union all
//                select TO_DATE('2023.08.02', 'YYYY.MM.DD') sale_date, 1 product_id, '1번상품' name , 100 amount from dual union all
//                select TO_DATE('2023.08.02', 'YYYY.MM.DD') sale_date, 1 product_id, '1번상품' name , 150 amount from dual union all
//                select TO_DATE('2023.08.03', 'YYYY.MM.DD') sale_date, 1 product_id, '1번상품' name , 100 amount from dual union all
//                select TO_DATE('2023.08.03', 'YYYY.MM.DD') sale_date, 1 product_id, '1번상품' name , 100 amount from dual union all
//                select TO_DATE('2023.08.03', 'YYYY.MM.DD') sale_date, 1 product_id, '1번상품' name , 100 amount from dual
//        )
//)
//        PIVOT (
//                SUM(amount) FOR sale_date IN (
//                        TO_DATE('2023.08.01', 'YYYY.MM.DD') AS "2023.08.01",
//                        TO_DATE('2023.08.02', 'YYYY.MM.DD') AS "2023.08.02",
//                        TO_DATE('2023.08.03', 'YYYY.MM.DD') AS "2023.08.03"
//                )
//        )
//        ORDER BY product_id;
    }
}
