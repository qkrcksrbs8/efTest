package cg.park.testSpringBoot._2023;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

@SpringBootTest
public class ApiTest {

    @Test
    public void test() {

        String url = "https://api.example.com/data";
        send(url);

    }

    public void send(String url) {
        try {

            // URL 객체 생성
            URL apiUrl = new URL(url);

            // HttpURLConnection 객체 생성
            HttpURLConnection connection = (HttpURLConnection) apiUrl.openConnection();
//            HttpsURLConnection connection = (HttpsURLConnection) apiUrl.openConnection();

            // 요청 메서드 설정 (GET)
            connection.setRequestMethod("GET");

            // 응답 코드 확인
            int responseCode = connection.getResponseCode();
            System.out.println("Response Code: " + responseCode);

            // 응답 내용 읽기
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            StringBuilder responseContent = new StringBuilder();

            while ((line = reader.readLine()) != null) {
                responseContent.append(line);
            }

            // 응답 내용 출력
            System.out.println("Response Content: " + responseContent.toString());

            // 연결 해제
            connection.disconnect();
        }
        catch (Exception e) {
            System.out.println("ERROR: "+e);
        }
    }
}
