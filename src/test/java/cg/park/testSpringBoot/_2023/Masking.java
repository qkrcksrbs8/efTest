package cg.park.testSpringBoot._2023;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.regex.Pattern;

@SpringBootTest
public class Masking {

    @Test
    public void test() {
        String id = "qkrcksrbs8";
        String name= "박찬균";
        String phone = "01039219258";

//        System.out.println("ID: " + masking("I", id));
//        System.out.println("PHONE: " + masking("P", phone));
//        System.out.println("NAME: " + koNameMasking(name, name.length()));
//        System.out.println("enName: " + enNameMasking(id, id.length()));



        HashMap<String, String> info = new HashMap<>();
//        info.put("u_login_id", "qkrcksrbs8");
//        info.put("cust_hnm", "qkrcksrbs8");
//        info.put("cell_phnno", "0103929258");
        test2(info);

        System.out.println("ID: " +info.get("u_login_id"));
        System.out.println("NAME: " +info.get("cust_hnm"));
        System.out.println("PHONE: " +info.get("cell_phnno"));

    }

    public String idMasking(String id) {
        if (null == id) return "";
        int cnt = id.length();
        if (2 > cnt) return id;

        StringBuffer sb = new StringBuffer();
        if (id.length() < 5) {
            for (int i = 0; i < cnt; i++) {
                if (i == id.length()-1) {
                    sb.append("*");
                    return sb.toString();
                }
                sb.append(id.charAt(i));
            }
            return sb.toString();
        }

        for (int i = 0; i < cnt; i++)
            sb.append((i >= 4) ? "*" : id.charAt(i));

        return sb.toString();
    }

    public String phoneMasking(String phone) {
        if (null == phone) return "";

        StringBuffer sb = new StringBuffer();
        int cnt = phone.length();

        // 010****1234
        if (11 == phone.length()) {
            for (int i = 0; i < cnt; i++)
                sb.append((i > 2 && 7 > i) ? "*" : phone.charAt(i));

            return sb.toString();
        }

        // 010***1234
        if (10 == phone.length()) {
            for (int i = 0; i < cnt; i++)
                sb.append((i > 2 && 6 > i) ? "*" : phone.charAt(i));

            return sb.toString();
        }

        // **********  -> all masking
        for (int i = 0; i < cnt; i++)
            sb.append("*");

        return sb.toString();
    }

    public boolean isKorChar(String word) {
        return Pattern.matches(".*[ㄱ-ㅎㅏ-ㅣ가-힣]+.*", word);
    }

    public String koNameMasking(String name, int cnt) {
        if (2 == cnt) return name.charAt(0) + "*";
        if (3 == cnt) return name.charAt(0) + "*" + name.charAt(2);
        if (4 == cnt) return name.charAt(0) + name.charAt(1) + "*" + name.charAt(3);

        StringBuffer sb = new StringBuffer();
        if (4 < cnt) {
            sb.append(name.charAt(0)).append(name.charAt(1));
            for (int i = 2; i < cnt; i++)
                sb.append("*");

            return sb.toString();
        }

        for (int i = 0; i < cnt; i++)
            sb.append("*");

        return sb.toString();
    }

    public String enNameMasking(String name, int cnt) {
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < cnt-3; i++)
            sb.append(name.charAt(i));

        sb.append("*").append("*").append(name.charAt(cnt-1));

        return sb.toString();
    }

    public String nameMasking(String name) {
        if (null == name) return "";

        int cnt = name.length();
        if (2 > cnt) return name;
        return (isKorChar(name.substring(0,1))) ? koNameMasking(name, cnt) : enNameMasking(name, cnt);
    }

    // id 마스킹: I
    // phone 마스킹: P
    // name 마스킹: N
    public String masking(String status, String str) {
        if ("I".equals(status)) return idMasking(str);
        if ("P".equals(status)) return phoneMasking(str);
        if ("N".equals(status)) return nameMasking(str);
        return masking(str);
    }

    public String masking(String str) {
        return "*****";
    }


    public void test2(HashMap<String, String> info) {

        String id = info.get("u_login_id");
        String name = info.get("cust_hnm");
        String phone = info.get("cell_phnno");

        if (null != name) {
            int cnt = name.length();
            if (2 <= cnt) {
                if (Pattern.matches(".*[ㄱ-ㅎㅏ-ㅣ가-힣]+.*", name.substring(0,1))) {
                    if (2 == cnt) {
                        name = name.charAt(0) + "*";
                    }
                    else if (3 == cnt) {
                        name = name.charAt(0) + "*" + name.charAt(2);
                    }
                    else if (4 == cnt) {
                        name = name.charAt(0) + name.charAt(1) + "*" + name.charAt(3);
                    }
                    else {
                        StringBuffer sb = new StringBuffer();
                        if (4 < cnt) {
                            sb.append(name.charAt(0)).append(name.charAt(1));
                            for (int i = 2; i < cnt; i++)
                                sb.append("*");

                            name = sb.toString();
                        }
                        else {
                            for (int i = 0; i < cnt; i++)
                                sb.append("*");

                            name = sb.toString();
                        }
                    }
                }
                else {
                    StringBuffer sb = new StringBuffer();

                    for (int i = 0; i < cnt-3; i++)
                        sb.append(name.charAt(i));

                    sb.append("*").append("*").append(name.charAt(cnt-1));
                    name = sb.toString();
                }
                info.put("cust_hnm", name);
            }
        }

        if (null != id) {
            int cnt = id.length();
            if (2 <= cnt) {
                StringBuffer sb = new StringBuffer();
                if (5 > id.length()) {
                    for (int i = 0; i < cnt; i++) {
                        if (i == id.length()-1) {
                            sb.append("*");
                            id = sb.toString();
                            continue;
                        }
                        sb.append(id.charAt(i));
                    }
                    id = sb.toString();
                }
                else {
                    for (int i = 0; i < cnt; i++)
                        sb.append((i >= 4) ? "*" : id.charAt(i));

                    id = sb.toString();
                }
                info.put("u_login_id", id);
            }
        }

        if (null != phone) {
            StringBuffer sb = new StringBuffer();
            int cnt = phone.length();
            if (11 == phone.length()) {
                for (int i = 0; i < cnt; i++)
                    sb.append((i > 2 && 7 > i) ? "*" : phone.charAt(i));

                phone = sb.toString();
            }
            else if (10 == phone.length()) {
                for (int i = 0; i < cnt; i++)
                    sb.append((i > 2 && 6 > i) ? "*" : phone.charAt(i));

                phone = sb.toString();
            }
            else {
                for (int i = 0; i < cnt; i++)
                    sb.append("*");

                phone =  sb.toString();
            }
            info.put("cell_phnno", phone);
        }

    }

}
