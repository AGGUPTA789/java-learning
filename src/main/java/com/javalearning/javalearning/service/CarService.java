package com.javalearning.javalearning.service;

import java.util.List;

import com.javalearning.javalearning.entity.Car;

public interface CarService {

	List<String> BRANDS = List.of("Toyota","Ford","Honda");
	List<String> COLOR = List.of("Red","Black","White");
	List<String> TYPE = List.of("Sedan","SUV","Hatchback");
	
	Car generateCar();
}
