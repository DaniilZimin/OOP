package com.company.model;

public class Car extends Vehicle implements GroundVehicle, EngineVehicle {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
}
