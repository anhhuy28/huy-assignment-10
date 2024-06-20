package com.coderscampus.Assignment10.spoonacular;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import java.net.URI;

import com.coderscampus.Assignment10.spoonacular.dto.DayResponse;
import com.coderscampus.Assignment10.spoonacular.dto.WeekResponse;

@Service
public class SpoonacularIntegration {
	
	private static String API_KEY = "a5fc380ddb91467cb3782042d57b152d";
	
	public WeekResponse getWeekMeals (String numCalories, String diet, String exclusions) {
		RestTemplate rt = new RestTemplate();
		
		URI uri = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
							 .queryParam("apiKey", API_KEY)
					         .queryParam("timeFrame", "week")
					         .queryParam("targetCalories", numCalories)
					         .queryParam("diet", diet)
					         .queryParam("exclude", exclusions)
					         .build()
					         .toUri();
		
		ResponseEntity<WeekResponse> response = rt.getForEntity(uri, WeekResponse.class);
		return response.getBody();
		}
	
	public DayResponse getDayMeals (String numCalories, String diet, String exclusions) {
		RestTemplate rt = new RestTemplate();
		
		URI uri = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
							 .queryParam("apiKey", API_KEY)
					         .queryParam("timeFrame", "day")
					         .queryParam("targetCalories", numCalories)
					         .queryParam("diet", diet)
					         .queryParam("exclude", exclusions)
					         .build()
					         .toUri();
		
		ResponseEntity<DayResponse> response = rt.getForEntity(uri, DayResponse.class);
		return response.getBody();
	}
}
