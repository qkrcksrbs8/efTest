package cg.park.testSpringBoot._2023;

import net.minidev.json.JSONObject;
import net.minidev.json.parser.JSONParser;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

@SpringBootTest
public class ApiTest {

    @Test
    public void test() {


//        test2();
////        String url = "https://https://www.naver.com/";
//        send("");

        test3();
    }

    public void send(String url) {
        try {
            url = "";
            // URL 객체 생성
            URL api = new URL(url);

            // HttpURLConnection 객체 생성
            HttpURLConnection conn = (HttpURLConnection) api.openConnection();// http
//            HttpsURLConnection conn = (HttpsURLConnection) api.openConnection();// https

            // 요청 메서드 설정 (GET)
            conn.setRequestMethod("GET");

            // 응답 코드 확인
            int resCode = conn.getResponseCode();
            System.out.println("Response Code: " + resCode);

            // 응답 내용 읽기
            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            StringBuilder res = new StringBuilder();

            while ((line = reader.readLine()) != null) {
                res.append(line);
            }

            // 응답 내용 출력
            System.out.println("Response Content: " + res);

            // 연결 해제
            conn.disconnect();
        }
        catch (Exception e) {
            System.out.println("ERROR: "+e);
        }
    }

    public void test2 () {
        //post body data
//        String strParam = "param1=apple&param2=banana&param3=grape";

        // 요청 URL
        String reqUrl = "";

        //결과값 담을 변수
        String returnStr 	   = "";

        HttpsURLConnection con = null;

        try {
            URL url = new URL(reqUrl);

            StringBuffer buf = new StringBuffer();

            con = (HttpsURLConnection)url.openConnection();

            //http method 설정
            con.setRequestMethod("POST");

            //서버통신 timeout 설정 (30초)
            con.setConnectTimeout(30000);

            //스트림읽기 timeout 설정 (30초)
            con.setReadTimeout(30000);

            //헤더설정
            con.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            con.setRequestProperty("Authorization", "sdfsdfsdfsdf");

            //OutputStream으로 POST 데이터 전달 옵션
            con.setDoOutput(true);

            //연결
            con.connect();

            // 송신할 데이터 전송.
            DataOutputStream dos = new DataOutputStream(con.getOutputStream());
//            dos.writeBytes(strParam);// post body data
            dos.flush();
            dos.close();

            //응답 읽기
            StringBuilder response = new StringBuilder();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(con.getInputStream()));

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                response.append(line);
            }
            bufferedReader.close();
            returnStr = response.toString();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //연결종료
            if (con != null) con.disconnect();
        }
    }


    public void test3() {
        try {

            String rememberMeUrl = "";// URL HTTPS OR HTTP

            URL apiUrl = new URL(rememberMeUrl);
            HttpsURLConnection connection = (HttpsURLConnection) apiUrl.openConnection();
//            HttpURLConnection con = (HttpURLConnection) apiUrl.openConnection();
            connection.setRequestMethod("GET");
            int responseCode = connection.getResponseCode();
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            StringBuilder responseContent = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                responseContent.append(line);
            }

            String jsonStr = responseContent.toString();
            JSONParser jsonParser = new JSONParser();
            JSONObject jsonObject = (JSONObject) jsonParser.parse(jsonStr);
            if (responseCode == 200) {
                if (null != jsonObject.get("mylgidAt") && !"".equals(jsonObject.get("mylgidAt"))
                        && null != jsonObject.get("mylgidRt") && !"".equals(jsonObject.get("mylgidRt"))) {

                }
            }
            connection.disconnect();

        } catch (Exception ee) {
            ee.printStackTrace();
        }
    }

}
