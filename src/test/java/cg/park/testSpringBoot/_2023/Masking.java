package cg.park.testSpringBoot._2023;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Masking {

    @Test
    public void test() {
        String id = "qkrcksrbs8";
        String n_id = "123456789";
        String name= "박찬균";
        String phone = "01039219258";

        System.out.println(masking("I", id));
        System.out.println(masking("P", phone));
        System.out.println(masking("N", name));
        System.out.println(masking(n_id));
    }

    public String idMasking(String id) {
        if (null == id) return "";
        if (id.length() < 5) return id;

        StringBuffer sb = new StringBuffer();
        int cnt = id.length();
        for (int i = 0; i < cnt; i++)
            sb.append((i >= 4) ? "*" : id.charAt(i));

        return sb.toString();
    }

    public String phoneMasking(String phone) {
        if (null == phone) return "";

        StringBuffer sb = new StringBuffer();
        int cnt = phone.length();
        for (int i = 0; i < cnt; i++)
            sb.append((i > 2 && 7 > i) ? "*" : phone.charAt(i));

        return sb.toString();
    }

    public String nameMasking(String name) {
        return name;
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

}
