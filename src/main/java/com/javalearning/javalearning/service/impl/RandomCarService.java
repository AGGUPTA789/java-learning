package com.javalearning.javalearning.service.impl;

import java.util.concurrent.ThreadLocalRandom;

import org.springframework.stereotype.Service;

import com.javalearning.javalearning.entity.Car;
import com.javalearning.javalearning.service.CarService;

@Service
public class RandomCarService implements CarService{

	@Override
	public Car generateCar() {
		var brand = BRANDS.get(ThreadLocalRandom.current().nextInt(BRANDS.size()));
		var color = COLOR.get(ThreadLocalRandom.current().nextInt(COLOR.size()));
		var type = TYPE.get(ThreadLocalRandom.current().nextInt(TYPE.size()));
		return new Car(brand, color, type, 0, false, null);
	}

}
