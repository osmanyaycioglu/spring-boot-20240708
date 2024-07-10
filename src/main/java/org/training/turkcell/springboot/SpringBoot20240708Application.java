package org.training.turkcell.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.training.turkcell.springboot.initial.Car;

@SpringBootApplication(scanBasePackages = {"org.training.turkcell.springboot","org.training.playground"})
public class SpringBoot20240708Application {

    public static void main(String[] args) {
        Car carLoc1 = new Car();
        Car carLoc2 = new Car();
        Car carLoc3 = new Car();
        Car carLoc4 = new Car();

        SpringApplication.run(SpringBoot20240708Application.class,
                              args);
    }

}
