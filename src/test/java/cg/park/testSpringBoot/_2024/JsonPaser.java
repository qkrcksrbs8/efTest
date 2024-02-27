package cg.park.testSpringBoot._2024;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.StringTokenizer;

@SpringBootTest
public class JsonPaser {

    @Test
    public void test() {
        String token = "access_token:pVP8HLuQ5fx2xTjKts5iCKO1CnVjCZaJC6UKKwzUAAABjcWSPobMISgqRbFCUQ,token_type:bearer,refresh_token:2eFkSoSE95kiVbZT9IkyfReBzmoXifz0WlcKKwzUAAABjcWSPoPMISgqRbFCUQ,expires_in:21599,refresh_token_expires_in:5183999";
        token.replaceAll("\"", "");
        token.replaceAll("\\{", "");
        StringTokenizer t = new StringTokenizer(token, ",");
        HashMap<String, String> map = new HashMap<>();
        while (t.hasMoreTokens()) {
            String[] arr = t.nextToken().split(":");
            map.put(arr[0], arr[1]);
        }

    }
}
