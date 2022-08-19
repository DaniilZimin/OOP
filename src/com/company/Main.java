package com.company;

import com.company.model.Bicycle;
import com.company.model.Car;
import com.company.model.Truck;
import com.company.model.Vehicle;
import com.company.service.ServiceStation;

public class Main {

    public static void main(String[] args) {

        Vehicle[] vehicles = {
                new Car("car1", 4),
                new Car("Car2", 4),
                new Truck("truck1", 6),
                new Truck("truck2", 8),
                new Bicycle("bicycle1", 2),
                new Bicycle("bicycle2", 2)
        };

        ServiceStation station = new ServiceStation();

        for (Vehicle vehicle : vehicles) {
            station.check(vehicle);
        }
    }
}
