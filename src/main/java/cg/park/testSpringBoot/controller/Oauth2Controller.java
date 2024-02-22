package cg.park.testSpringBoot.controller;

import cg.park.testSpringBoot.dto.KakaoToken;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.net.ssl.HttpsURLConnection;
import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashMap;
import java.util.StringTokenizer;

@RequestMapping("/oauth2")// 각 플랫폼별로 분기 필요.
@Controller
public class Oauth2Controller {

    @GetMapping("/main")
    public String view() {
        return "/oauth2/view";
    }

    @GetMapping("/callback")
    public String callback(HttpServletRequest request) {
        String code = request.getParameter("code");
        send("https://kauth.kakao.com/oauth/token", code);
        return "/oauth2/complete";
    }

    @GetMapping("/completeLogin")
    public String kakaoComplete() {
        return "/oauth2/completeLogin";
    }

    public void send(String reqUrl, String code) {
        String CLIENT_ID = "4f6a3f7fc682f73a86bc75ce8f003791";
        String REDIRECT_URI = "http://localhost:8080/oauth2/callback";
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
            //        String strParam = "param1=apple&param2=banana&param3=grape";
            String strParam = "grant_type=authorization_code&client_id="+CLIENT_ID+"&redirect_uri="+REDIRECT_URI+"&code="+code;
            dos.writeBytes(strParam);// post body data
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
            returnStr = returnStr.replaceAll("\"", "");
            returnStr = returnStr.replaceAll("\\{", "");
            returnStr = returnStr.replaceAll("}", "");
            StringTokenizer t = new StringTokenizer(returnStr, ",");
            HashMap<String, String> map = new HashMap<>();
            while (t.hasMoreTokens()) {
                String[] arr = t.nextToken().split(":");
                map.put(arr[0], arr[1]);
            }
            System.out.println("kakao result: "+returnStr);
            System.out.println("kakao map: "+map);
            KakaoToken k = kakaoToken(map);
        }
        catch (Exception e) {
            System.out.println("ERROR: "+e);
        }
    }

    public KakaoToken kakaoToken(HashMap<String, String> map) {
        KakaoToken token = new KakaoToken();
        token.setToken_type(map.get("token_type"));
        token.setAccess_token(map.get("access_token"));
        token.setExpires_in(map.get("expires_in"));
        token.setRefresh_token(map.get("refresh_token"));
        token.setRefresh_token_expires_in(map.get("refresh_token_expires_in"));
        return token;
    }
}
