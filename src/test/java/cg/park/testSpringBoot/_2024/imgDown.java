package cg.park.testSpringBoot._2024;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.net.ssl.HttpsURLConnection;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

@SpringBootTest
public class imgDown {

    public static void downloadImage(String imageUrl, String destinationFile) throws IOException {
        // 이미지 URL로부터 HttpURLConnection을 통해 연결
        HttpsURLConnection connection = (HttpsURLConnection) new URL(imageUrl).openConnection();
        connection.setRequestMethod("GET");

        // 연결하여 응답 코드 확인
        int responseCode = connection.getResponseCode();
        if (responseCode == HttpsURLConnection.HTTP_OK) {
            // 연결하여 이미지 스트림 가져오기
            InputStream inputStream = connection.getInputStream();

            // 이미지를 저장할 파일 생성
            OutputStream outputStream = new FileOutputStream(destinationFile);

            // 이미지를 파일로 저장
            byte[] buffer = new byte[2048];
            int length;
            while ((length = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, length);
            }

            // 스트림과 연결 닫기
            inputStream.close();
            outputStream.close();
            System.out.println("success !!!");
        } else {
            System.out.println("fail: " + responseCode);
        }
    }


    @Test
    public void test() {
        String imageUrl = "https://image.ethefaceshop.com/tfsshopWebSrc/upload/smeditor//2024/1711599061374.jpg"; // 다운로드할 이미지 URL
        String destinationFile = "D:\\pcg\\DES\\sou\\SM"; // 이미지를 저장할 파일 경로

        try {
            downloadImage(imageUrl, destinationFile);
        } catch (IOException e) {
            System.out.println("E: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
