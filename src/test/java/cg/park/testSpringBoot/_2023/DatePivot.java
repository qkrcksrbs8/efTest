package cg.park.testSpringBoot._2023;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DatePivot {

    @Test
    public void test() {
//        SELECT *
//                FROM (
//                        SELECT saleDate, product_id, name, amount
//        FROM (
//                select TO_DATE('2023.08.01', 'YYYY.MM.DD') saleDate, 1 productId, '1번상품' name , 100 amount from dual union all
//                select TO_DATE('2023.08.01', 'YYYY.MM.DD') saleDate, 1 productId, '1번상품' name , 100 amount from dual union all
//                select TO_DATE('2023.08.01', 'YYYY.MM.DD') saleDate, 2 productId, '2번상품' name , 10 amount from dual union all
//                select TO_DATE('2023.08.02', 'YYYY.MM.DD') saleDate, 1 productId, '1번상품' name , 100 amount from dual union all
//                select TO_DATE('2023.08.02', 'YYYY.MM.DD') saleDate, 1 productId, '1번상품' name , 150 amount from dual union all
//                select TO_DATE('2023.08.03', 'YYYY.MM.DD') saleDate, 1 productId, '1번상품' name , 100 amount from dual union all
//                select TO_DATE('2023.08.03', 'YYYY.MM.DD') saleDate, 1 productId, '1번상품' name , 100 amount from dual union all
//                select TO_DATE('2023.08.03', 'YYYY.MM.DD') saleDate, 1 productId, '1번상품' name , 100 amount from dual
//        )
//)
//        PIVOT (
//                SUM(amount) FOR saleDate IN (
//                        TO_DATE('2023.08.01', 'YYYY.MM.DD') AS "2023.08.01",
//                        TO_DATE('2023.08.02', 'YYYY.MM.DD') AS "2023.08.02",
//                        TO_DATE('2023.08.03', 'YYYY.MM.DD') AS "2023.08.03"
//                )
//        )
//        ORDER BY productId;
    }
}
