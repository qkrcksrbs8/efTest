package cg.park.testSpringBoot.service.impl;

import cg.park.testSpringBoot.comm.util.Param;
import cg.park.testSpringBoot.daos.MealDao;
import cg.park.testSpringBoot.service.CommandAbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class InsertMealServiceImpl extends CommandAbstractService {

    @Autowired
    MealDao mealDao;

    public Param preService(Param param) {
        String[] columns =
                {"timeType", "createdBy", "restaurantName", "minuteWalkingDistance", "visitDate", "tasteLank", "foodType", "foodName"};
        return check(param, columns);
    }

    public Param check(Param param, String[] columns) {
        for (String column : columns)
            if (isNotExist(param, column))
                return param.code("P0001");

        return param.code("S0001");
    }

    public boolean isNotExist(Param param, String column) {
        return "".equals(param.getOrDefault(column, ""));
    }

    @Transactional(rollbackFor=Exception.class)
    public Param postService(Param param) {
        try {
            mealDao.insertMeal(param);
            mealDao.insertRestaurant(param);
            mealDao.insertMealHistory(param);
            return new Param().code("S0001");
        }
        catch (Exception e) {
            return param.code("E0001");
        }
    }
}
