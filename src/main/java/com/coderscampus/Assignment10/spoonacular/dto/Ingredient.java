package com.coderscampus.Assignment10.spoonacular.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Ingredient {

	@JsonProperty("name")
	private String name;
	@JsonProperty("unit")
	private String unit;
	@JsonProperty("amount")
	private String amount;
	@JsonProperty("image")
	private String image;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

}
