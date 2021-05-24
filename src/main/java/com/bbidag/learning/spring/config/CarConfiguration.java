package com.bbidag.learning.spring.config;

import com.bbidag.learning.spring.domain.car.Car;
import com.bbidag.learning.spring.domain.car.Sedan;
import com.bbidag.learning.spring.domain.car.SportsCar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class CarConfiguration {

    @Bean(name="sedan")
    public Car carBuilder(){
        return new Sedan();
    }

    @Primary
    @Bean(name="sportsCar")
    public Car sportsCarBuilder(){
        return new SportsCar();
    }

}
