package com.javalearning.javalearning.api.server;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javalearning.javalearning.entity.Car;
import com.javalearning.javalearning.service.CarService;

import ch.qos.logback.classic.Logger;

@RestController
@RequestMapping("/api/car/v1")
public class CarAPI {

	@Autowired
	private CarService carService;
	
	private static final Logger LOG = (Logger) LoggerFactory.getLogger(CarAPI.class);
	
	@GetMapping(value="/random")
	public Car random()
	{
		return carService.generateCar();
	}
	@PostMapping(value="/echo")
	public String echo(@RequestBody Car car)
	{
		
		LOG.info("Car is :" + car);
		return car.toString();
	}
	
	
}
