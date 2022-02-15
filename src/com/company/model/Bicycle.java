package com.company.model;

public class Bicycle extends Vehicle implements GroundVehicle {
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
}
