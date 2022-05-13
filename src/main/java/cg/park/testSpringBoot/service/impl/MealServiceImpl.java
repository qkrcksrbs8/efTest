package cg.park.testSpringBoot.service.impl;

import cg.park.testSpringBoot.comm.util.Param;
import cg.park.testSpringBoot.daos.MealDao;
import cg.park.testSpringBoot.service.CommandAbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MealServiceImpl extends CommandAbstractService {

    public Param preService(Param param) {
        return (isEmptyMealNo(param))
                ? new Param().set("code", "P0001")
                : param.set("code", "S0001");
    }

    public boolean isEmptyMealNo(Param param) {
        return param.get("mealNo") == null;
    }

    @Autowired
    MealDao mealDao;
    public Param postService() {
        return new Param()
                .set("code", "S0001")
                .set("mealList", mealDao.selectMeals(new Param().set("mealNo", 0)));
    }
    public Param postService(Param param) {
        List<Param> list = mealDao.selectMeals(param);
        if (list.isEmpty()) return new Param().set("code", "E0001");
        return new Param()
                .set("code", "S0001")
                .set("mealList", mealDao.selectMeals(param));
    }

}
