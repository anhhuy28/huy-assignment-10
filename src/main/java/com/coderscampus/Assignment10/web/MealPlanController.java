package com.coderscampus.Assignment10.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.coderscampus.Assignment10.spoonacular.SpoonacularIntegration;
import com.coderscampus.Assignment10.spoonacular.dto.DayResponse;
import com.coderscampus.Assignment10.spoonacular.dto.WeekResponse;

@RestController
public class MealPlanController {

	@Autowired
	private SpoonacularIntegration spoonacularIntegration;
	
	@GetMapping("mealplanner/week")
	public ResponseEntity<WeekResponse> getWeekMeals(@RequestParam(required = false, defaultValue = "2000") String numCalories,@RequestParam(required = false) String diet,@RequestParam(required = false) String exclusions) {		

		WeekResponse weekResponse = spoonacularIntegration.getWeekMeals(numCalories, diet, exclusions);
		return ResponseEntity.ok(weekResponse);
	}

	@GetMapping("mealplanner/day")
	public ResponseEntity<DayResponse> getDayMeals(@RequestParam(required = false, defaultValue = "2000") String numCalories,@RequestParam(required = false) String diet,@RequestParam(required = false) String exclusions) {

		 DayResponse dayResponse = spoonacularIntegration.getDayMeals(numCalories, diet, exclusions);
		return ResponseEntity.ok(dayResponse);
	}
	
}
