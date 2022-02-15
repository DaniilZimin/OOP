package com.company.model;

public class Truck extends Vehicle implements GroundVehicle, EngineVehicle, TrailerVehicle {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
}
