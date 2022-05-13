package cg.park.testSpringBoot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.List;

@Controller
public class MainController {

    @GetMapping("/")
    public String index() {
        System.out.println("index");
        return "index";
    }

    @PostMapping("/checkbox")
    public String checkbox(HttpServletRequest request, Model model) {
        System.out.println("checkbox");

        List<String> nb = Arrays.asList(request.getParameterValues("nb"));
        String nbAllAppend = nb.toString().replace("[", "").replace("]", "");
        System.out.println(nbAllAppend);
        return "redirect:/";
    }
}
