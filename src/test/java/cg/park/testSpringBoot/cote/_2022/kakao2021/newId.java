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

        //1�ܰ� new_id�� ��� �빮�ڸ� �����Ǵ� �ҹ��ڷ� ġȯ�մϴ�.
        new_id = new_id.toLowerCase();

        //2�ܰ� new_id���� ���ĺ� �ҹ���, ����, ����(-), ����(_), ��ħǥ(.)�� ������ ��� ���ڸ� �����մϴ�.
        new_id = emptyWord(new_id);

        //3�ܰ� new_id���� ��ħǥ(.)�� 2�� �̻� ���ӵ� �κ��� �ϳ��� ��ħǥ(.)�� ġȯ�մϴ�.
        new_id = closeCheck(new_id);

        //4�ܰ� new_id���� ��ħǥ(.)�� ó���̳� ���� ��ġ�Ѵٸ� �����մϴ�.
        new_id = startEndCheck(new_id);

        //5�ܰ� new_id�� �� ���ڿ��̶��, new_id�� "a"�� �����մϴ�.
        new_id = ("".equals(new_id)) ? "a" : new_id;

        //6�ܰ� new_id�� ���̰� 16�� �̻��̸�, new_id�� ù 15���� ���ڸ� ������ ������ ���ڵ��� ��� �����մϴ�.
        new_id = (new_id.length() >= 16) ? new_id.substring(0, 15) : new_id;

        //���� ���� �� ��ħǥ(.)�� new_id�� ���� ��ġ�Ѵٸ� ���� ��ġ�� ��ħǥ(.) ���ڸ� �����մϴ�.
        new_id = startEndCheck(new_id);

        //7�ܰ� new_id�� ���̰� 2�� ���϶��, new_id�� ������ ���ڸ� new_id�� ���̰� 3�� �� ������ �ݺ��ؼ� ���� ���Դϴ�.
        new_id = treeWordCheck(new_id);

        return new_id;
    }

}
