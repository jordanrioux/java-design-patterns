package com.codewithjordy.patterns.creational.builder.example2;

public class BadHouse {
    private int windows;
    private int doors;
    private int rooms;
    private boolean hasGarage;
    private boolean hasGarden;
    private boolean hasSwimPool;

    public BadHouse(
            int windows,
            int doors,
            int rooms,
            boolean hasGarage,
            boolean hasGarden,
            boolean hasSwimPool) {
        this.windows = windows;
        this.doors = doors;
        this.rooms = rooms;
        this.hasGarage = hasGarage;
        this.hasGarden = hasGarden;
        this.hasSwimPool = hasSwimPool;
    }
}
