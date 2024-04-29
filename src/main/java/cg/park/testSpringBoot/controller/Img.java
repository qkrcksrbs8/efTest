package cg.park.testSpringBoot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

@Controller
public class Img {

    @RequestMapping("/img/down")
    public void test() {
        String imageUrl = ""; // 다운로드할 이미지 URL
        String destinationFile = "/"; // 이미지를 저장할 파일 경로

        try {
            // 이미지 URL로부터 스트림 열기
            InputStream inputStream = new URL(imageUrl).openStream();

            // 이미지를 저장할 파일 생성
            OutputStream outputStream = new FileOutputStream(destinationFile);

            // 입력 스트림에서 출력 스트림으로 이미지 복사
            byte[] buffer = new byte[2048];
            int length;
            while ((length = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, length);
            }

            // 스트림 닫기
            inputStream.close();
            outputStream.close();

            System.out.println("success.");
        } catch (IOException e) {
            System.out.println("fail: " + e);
            e.printStackTrace();
        }
    }
}
