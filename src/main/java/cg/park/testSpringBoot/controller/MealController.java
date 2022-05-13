package cg.park.testSpringBoot.controller;

import cg.park.testSpringBoot.comm.util.Message;
import cg.park.testSpringBoot.comm.util.Param;
import cg.park.testSpringBoot.comm.util.Proxy;
import cg.park.testSpringBoot.service.impl.InsertMealServiceImpl;
import cg.park.testSpringBoot.service.impl.MealServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/meal")
@ResponseBody
@Controller
public class MealController {

    @Autowired
    MealServiceImpl mealService;

    @Autowired
    InsertMealServiceImpl insertMealService;

    @Autowired
    Proxy proxy;

    @GetMapping("/menu")
    public ResponseEntity<Message> menu() {
        return proxy.res(mealService.execute());
    }

    @GetMapping("/menu/{mealNo}")
    public ResponseEntity<Message> menu(@PathVariable("mealNo") int mealNo) {
        return proxy.res(mealService.execute(new Param().set("mealNo", mealNo)));
    }

    @PostMapping("/menu")
    public ResponseEntity<Message> menu(@RequestBody Param param) {
        return proxy.res(insertMealService.execute(param));
    }
}
