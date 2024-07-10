package org.training.turkcell.springboot.initial;

import lombok.Data;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Data
//@Component("myCarBean")
//@Scope("prototype")
//@Service
//@Controller
//@Configuration

public class Car {
    private String name;
    private String model;
    private int horsePower;

    public void forward(){
    }

    public void turn(){
    }

}
