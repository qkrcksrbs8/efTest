package cg.park.testSpringBoot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@RequestMapping("/oauth2")
@Controller
public class Oauth2Controller {

    @GetMapping("/main")
    public String view() {

        return "/oauth2/view";
    }

    @GetMapping("/callback")
    public String callback(HttpServletRequest request) {
        System.out.println("[callback]#############################");
        return "/oauth2/complete";
    }

    @GetMapping("/completeLogin")
    public String kakaoComplete() {
        return "/oauth2/completeLogin";
    }

}