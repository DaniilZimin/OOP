package com.company.model;

public interface TrailerVehicle {
    default void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}
