package com.carrental.dao;

import com.carrental.model.Car;
import java.util.*;

public class CarDAO {
    private static List<Car> cars = new ArrayList<>();

    static {
        cars.add(new Car(1, "Toyota", true));
        cars.add(new Car(2, "Honda", true));
    }

    public List<Car> getAllCars() {
        return cars;
    }

    public void updateAvailability(int id, boolean available) {
        for (Car car : cars) {
            if (car.getId() == id) {
                car.setAvailable(available);
                break;
            }
        }
    }
}
