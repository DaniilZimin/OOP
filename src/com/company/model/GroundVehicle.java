package com.company.model;

public interface GroundVehicle {
    default void updateTyre() {
        System.out.println("Меняем покрышку");
    }
}
