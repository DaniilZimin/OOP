package com.company.model;

public interface EngineVehicle {
    default void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}
