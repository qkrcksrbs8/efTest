package cg.park.testSpringBoot.controller;

import cg.park.testSpringBoot.annotation.TimeCheck;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/view")
@Controller
public class MealController {

    @TimeCheck
    @GetMapping("/meal")
    public String meal() {
        System.out.println("meal 화면");
        return "meal";
    }
}
