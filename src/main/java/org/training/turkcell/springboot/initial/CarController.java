package org.training.turkcell.springboot.initial;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CarController {

    private final CarManager carManager3;

    // Field Injection - 3 reflection
    @Autowired
    private CarManager carManager;

    private CarManager carManager2;

    // Constructor Injection - 1 reflection
    // @Autowired - optional
    @Autowired
    public CarController(final CarManager carManagerParam) {
        carManager3 = carManagerParam;
        System.out.println("Init");
    }

    public CarController(final CarManager carManagerParam,
                         String extraStr) {
        carManager3 = carManagerParam;
        System.out.println("Init");
    }

    // Method Injection - 3 reflection
    @Autowired
    public void method(final CarManager carManagerParam) {
        carManager2 = carManagerParam;
    }

    @PostConstruct
    public void init() {
        System.out.println("Init");
    }

    @PreDestroy
    public void destroy() {
        try {
         Thread.sleep(1_000);
        } catch (Exception exp) {
        }

        System.out.println("Destroy - CarController");
    }


}
