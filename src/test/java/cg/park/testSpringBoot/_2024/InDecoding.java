package cg.park.testSpringBoot._2024;

import cg.park.testSpringBoot._2023.AES256;
import cg.park.testSpringBoot.comm.util.Param;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class InDecoding {

    @Test
    public void test() {
        AES256 aes256 = new AES256();
        Param param = new Param();
        String name = "ABCD";
        String encryptName = "";
        String dcryptName = "";
        try {
            encryptName = aes256.encrypt(name);
            dcryptName =aes256.decrypt(encryptName);
        }
        catch (Exception e) {
            System.out.println("e: "+e);
        }
        param.set("name", encryptName);
        System.out.println("encrypt: "+encryptName);
        System.out.println("dcryptName: "+dcryptName);


    }
}
