package cg.park.testSpringBoot.cote._2022.kakao2021;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class newId {

    @Test
    public void test() {

//        String id = "...!@BaT#*..y.abcdefghijklm";
//        String id = "z-+.^.";
        String id = "abcdefghijklmn.p";
        String result = solution(id);
        System.out.println(result);
    }

    public String emptyWord(String str) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (47 < c && c < 58) {
                sb.append(c);
                continue;
            }
            if (96 < c && c < 123) {
                sb.append(c);
                continue;
            }
            if ('-' == c || '_' == c || '.' == c) {
                sb.append(c);
                continue;
            }
        }
        return sb.toString();
    }

    public String closeCheck(String str) {
        StringBuffer sb = new StringBuffer();
        boolean flag = false;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if ('.' == c) {
                if (flag) {
                    continue;
                }
                sb.append(c);
                flag = true;
                continue;
            }
            sb.append(c);
            flag = false;
        }
        return sb.toString();
    }

    public String startEndCheck(String str) {
        if (str.startsWith(".")) {
            str = str.substring(1);
        }
        if (str.endsWith(".")) {
            str = str.substring(0, str.length()-1);
        }
        return str;
    }

    public String treeWordCheck(String str) {
        if (str.length() > 2) return str;

        str = str + str.substring(str.length()-1);

        return (str.length() > 2) ? str : str + str.substring(str.length()-1);
    }

    public String solution(String new_id) {

        //1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
        new_id = new_id.toLowerCase();

        //2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
        new_id = emptyWord(new_id);

        //3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
        new_id = closeCheck(new_id);

        //4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
        new_id = startEndCheck(new_id);

        //5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
        new_id = ("".equals(new_id)) ? "a" : new_id;

        //6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
        new_id = (new_id.length() >= 16) ? new_id.substring(0, 15) : new_id;

        //만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
        new_id = startEndCheck(new_id);

        //7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
        new_id = treeWordCheck(new_id);

        return new_id;
    }

}
