package com.codewithjordy.patterns.builder.example2;

public class House {
    private int walls;
    private int doors;
    private int rooms;

    public House(HouseBuilder houseBuilder) {
        this.walls = houseBuilder.getWindows();
        this.doors = houseBuilder.getDoors();
        this.rooms = houseBuilder.getRooms();
    }
}
