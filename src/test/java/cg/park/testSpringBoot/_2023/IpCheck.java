package cg.park.testSpringBoot._2023;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class IpCheck {

    @Test
    public void test() {

//        162.221.144.0	162.221.147.255
//        167.88.52.0	167.88.55.255
//        192.190.19.0	192.190.19.255
//        216.38.167.0	216.38.167.255
//        64.40.4.0	64.40.7.255
//        64.66.32.0	64.66.35.255

        String ip = "10.40.137.243";

        System.out.println(ip.substring(0, ip.lastIndexOf(".")));

    }

    public boolean isUCM(String ip) {
        // 미국, 캐나다, 맥시코 IP 체크 함수
        //
        return false;
    }

//    -- #######################################################################
//            -- 테이블 생성
//    CREATE TABLE ip_table (
//            country VARCHAR2(10),
//    s_ip VARCHAR2(45),
//    e_ip VARCHAR2(45),
//    S_NUM NUMBER,
//    E_NUM NUMBER,
//    regist_date DATE default sysdate,
//    update_date DATE default sysdate
//);
//
//    CREATE INDEX ip_table_INDEX1 ON ip_table ("START_NUM") ;
//    CREATE INDEX ip_table_INDEX2 ON ip_table ("END_NUM") ;
//
//    comment on table ip_table is '국가IP';
//
//    comment on column ip_table.country is '국가코드';
//    comment on column ip_table.s_ip is '시작IP';
//    comment on column ip_table.e_ip is '종료IP';
//    comment on column ip_table.S_NUM is '시작IP숫자변환값';
//    comment on column ip_table.E_NUM is '종료IP숫자변환값';
//    comment on column ip_table.regist_date is '생성일';
//    comment on column ip_table.update_date is '수정일';
//-- #######################################################################
//
//        -- 시작IP, 종료IP 체크를 위한 숫자변환 값 조회
//    select s_ip,REGEXP_SUBSTR(s_ip , '[^.]+', 1, 1)* 16777216 +
//    REGEXP_SUBSTR(s_ip , '[^.]+', 1, 2)* 65536 +
//    REGEXP_SUBSTR(s_ip , '[^.]+', 1, 3)* 256 +
//    REGEXP_SUBSTR(s_ip , '[^.]+', 1, 4) start_num
//      , e_ip,REGEXP_SUBSTR(e_ip , '[^.]+', 1, 1)* 16777216 +
//    REGEXP_SUBSTR(e_ip , '[^.]+', 1, 2)* 65536 +
//    REGEXP_SUBSTR(e_ip , '[^.]+', 1, 3)* 256 +
//    REGEXP_SUBSTR(e_ip , '[^.]+', 1, 4) end_num
//    from ip_table
//            ;
//
//    select count(*) from ip_table where S_IP = '10.41.123.0';
//
//    select * from ip_table where S_IP = '10.40.137.0';
//
//-- IP 테이블 전체 업데이트
//    update ip_table
//    set start_num = REGEXP_SUBSTR(s_ip , '[^.]+', 1, 1)* 16777216 +
//            REGEXP_SUBSTR(s_ip , '[^.]+', 1, 2)* 65536 +
//            REGEXP_SUBSTR(s_ip , '[^.]+', 1, 3)* 256 +
//            REGEXP_SUBSTR(s_ip , '[^.]+', 1, 4)
//            ,   end_num = REGEXP_SUBSTR(e_ip , '[^.]+', 1, 1)* 16777216 +
//            REGEXP_SUBSTR(e_ip , '[^.]+', 1, 2)* 65536 +
//            REGEXP_SUBSTR(e_ip , '[^.]+', 1, 3)* 256 +
//            REGEXP_SUBSTR(e_ip , '[^.]+', 1, 4)
//    where 1=1;
//    commit;
//
//
//-- 업데이트로 아이피 등록여부. ->  ip
//--update ip_table set s_num = 170428672, e_num = 170428927 where S_IP = '10.40.137.0';
//--commit;
//--0 0
//        --170428672	170428927
//        --
//        --insert into ip_table (COUNTRY, S_IP, E_IP)
//--values('US', '10.41.123.0', '10.41.123.255');
//
//
//10.41.123.92
//        10.41.123.0 ~ 10.41.123.255
//
//
//
//
//        -- 해당 쿼리에 조회되어야 팝업 노출
//    select count(*) from ip_table ip
//    where (REGEXP_SUBSTR(#{ip} , '[^.]+', 1, 1)* 16777216 +
//    REGEXP_SUBSTR(#{ip} , '[^.]+', 1, 2)* 65536 +
//    REGEXP_SUBSTR(#{ip} , '[^.]+', 1, 3)* 256 +
//    REGEXP_SUBSTR(#{ip} , '[^.]+', 1, 4) )
//    BETWEEN S_NUM AND E_NUM




}
