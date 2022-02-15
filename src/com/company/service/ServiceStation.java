package com.company.service;

import com.company.model.EngineVehicle;
import com.company.model.GroundVehicle;
import com.company.model.TrailerVehicle;
import com.company.model.Vehicle;

public class ServiceStation {
    public void check(Vehicle vehicle) {
        if (vehicle == null) {
            return;
        }
        System.out.println();
        System.out.println("Обслуживаем " + vehicle.getModelName());

        if (vehicle instanceof GroundVehicle) {
            for (int i = 0; i < vehicle.getWheelsCount(); i++) {
                ((GroundVehicle) vehicle).updateTyre();
            }
        }

        if (vehicle instanceof EngineVehicle) {
            ((EngineVehicle) vehicle).checkEngine();
        }

        if (vehicle instanceof TrailerVehicle) {
            ((TrailerVehicle) vehicle).checkTrailer();
        }
    }
}
