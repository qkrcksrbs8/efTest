package cg.park.testSpringBoot;

import cg.park.testSpringBoot.comm.util.Param;
import cg.park.testSpringBoot.comm.util.PcgUtil;
import cg.park.testSpringBoot.daos.MealDao;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;

@SpringBootTest
public class mealTest {

    @Autowired
    MealDao mealDao;

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Test
    public void selectMeal() {
        printListMap(mealDao.selectMeals(new Param().set("mealNo", 0)));
    }

    @Test
    public void selectMeals() {
        printListMap(mealDao.selectMeals(new Param().set("mealNo", 3)));
    }

    @Autowired
    PcgUtil pcgUtil;

    private void printMap(HashMap<String, Object> map) {
        if (pcgUtil.isMapEmpty(map)) return;
        logger.info(map.toString());
    }

    private void printListMap(List<HashMap<String, Object>> list) {
        list.forEach(map -> printMap(map));
    }

    @Transactional(rollbackFor=Exception.class)
    @Test
    public void insertMeal() {
        try {
            Param param =
                    new Param()
                    .set("timeType", "LC")
                    .set("createdBy", "pcg")
                    .set("restaurantName", "서울촌놈수육국")
                    .set("minuteWalkingDistance", 5)
                    .set("visitDate", "20220510")
                    .set("tasteLank", "A")
                    .set("foodType", "KR")
                    .set("foodName", "곱창국밥");
            mealDao.insertMeal(param);
            mealDao.insertRestaurant(param);
            mealDao.insertMealHistory(param);
            throw new Exception();
        }
        catch (Exception e) {
            logger.error("오류발생");
            logger.error(e.toString());
        }
    }

    @Test
    public void toStringTest() {
        toString().equals("111");
    }

}
