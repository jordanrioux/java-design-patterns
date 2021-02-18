package com.codewithjordy.patterns.creational.builder.example2;

public class HouseBuilder {
    private int windows;
    private int doors;
    private int rooms;

    public HouseBuilder buildWindows(int windows) {
        this.windows = windows;
        return this;
    }

    public HouseBuilder buildDoors(int doors) {
        this.doors = doors;
        return this;
    }

    public HouseBuilder buildRooms(int rooms) {
        this.rooms = rooms;
        return this;
    }

    public HouseBuilder buildGarage() {
        // TODO: build garage
        return this;
    }

    public HouseBuilder buildSwimPool() {
        // TODO: build swim pool
        return this;
    }

    public House build() {
        return new House(this);
    }

    // Getters/Setters are needed since this class is not an inner class
    // Which mean that the House class can't access the HouseBuilder variables directly.
    public int getWindows() {
        return windows;
    }

    public int getDoors() {
        return doors;
    }

    public int getRooms() {
        return rooms;
    }
}
