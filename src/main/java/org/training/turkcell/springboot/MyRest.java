package org.training.turkcell.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;
import org.training.turkcell.springboot.initial.Car;
import org.training.turkcell.springboot.initial.CarManager;

@RestController
@RequestMapping("/hello")
public class MyRest {

    @Autowired
    private CarManager carManager;

    @GetMapping("/hello1")
    public String method(){
        return "Hello world";
    }
}
