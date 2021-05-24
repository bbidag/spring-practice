package com.bbidag.learning.spring.controller;

import com.bbidag.learning.spring.domain.car.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {

    private Car car;

    public CarController(@Qualifier("sedan") Car sedan){
        this.car = sedan;
    }

    @GetMapping("/move/car")
    public String moveCar(){
        car.move();
        return "차가 움직였습니다.";
    }

}
