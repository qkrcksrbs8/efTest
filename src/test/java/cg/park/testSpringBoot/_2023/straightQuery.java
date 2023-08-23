package cg.park.testSpringBoot._2023;

public class straightQuery {

//    select distinct mem_id, max(straightDate) from (
//    SELECT
//            mem_id,
//    COUNT(*) AS straightDate
//    FROM (
//            select mem_id, days, TO_NUMBER(days)-ROWNUM as rnum
//    from
//            (
//                    SELECT TO_CHAR(base_mon + LEVEL - 1, 'yyyyMMdd') days
//    FROM (SELECT TO_DATE('20230801', 'yyyyMMdd') base_mon FROM DUAL)
//    CONNECT BY base_mon + LEVEL - 1 <= TO_DATE('20230831', 'yyyyMMdd')
//           ) a, (
//    SELECT mem_id, check_date
//    FROM (
//            select 'park' mem_id, '20230801' check_date from dual union all
//            select 'park' mem_id, '20230802' check_date from dual union all
//                    select 'park' mem_id, '20230803' check_date from dual union all
//                    select 'park' mem_id, '20230804' check_date from dual union all
//                    select 'park' mem_id, '20230805' check_date from dual union all
//                    select 'kim' mem_id, '20230801' check_date from dual union all
//                    select 'kim' mem_id, '20230802' check_date from dual union all
//                    select 'kim' mem_id, '20230803' check_date from dual union all
//                    select 'kim' mem_id, '20230810' check_date from dual union all
//                    select 'kim' mem_id, '20230811' check_date from dual union all
//                    select 'kim' mem_id, '20230812' check_date from dual union all
//                    select 'kim' mem_id, '20230813' check_date from dual
//    ) a
//    WHERE check_date >= '20230801'
//    AND check_date <= '20230831'
//            ) b
//    WHERE a.days = b.check_date(+)
//            )
//    having mem_id is not null
//    GROUP BY mem_id, rnum
//    ORDER BY straightDate DESC
//)
//    where straightDate >= 3
//    group by mem_id
//    ;
}
