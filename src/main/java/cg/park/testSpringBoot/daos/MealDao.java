package cg.park.testSpringBoot.daos;

import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface MealDao {
    List<HashMap<String, Object>> selectMeals(HashMap<String, Object> map);
    void insertMeal(HashMap<String, Object> map);
    void insertRestaurant(HashMap<String, Object> map);
    void insertMealHistory(HashMap<String, Object> map);
}
