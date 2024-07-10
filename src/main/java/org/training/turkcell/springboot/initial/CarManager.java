package org.training.turkcell.springboot.initial;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class CarManager {
    private Map<String, Car> carModels = new HashMap<>();

    public Car getModel(String model) {
        return carModels.get(model);

    }

    public void addModel(Car carParam) {
        carModels.put(carParam.getModel(),
                      carParam);
    }
}
