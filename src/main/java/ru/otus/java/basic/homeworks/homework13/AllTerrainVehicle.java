package ru.otus.java.basic.homeworks.homework13;

public class AllTerrainVehicle implements Transport {
    private int fuel;

    public AllTerrainVehicle(int fuel) {
        this.fuel = fuel;
    }

    @Override
    public boolean canMove(TerrainType terrain) {
        return true;
    }

    @Override
    public boolean move(int distance, TerrainType terrain) {
        int consumption = distance * 2;
        if (fuel >= consumption) {
            fuel -= consumption;
            System.out.printf("Вездеход преодолел %d км по %s. Осталось топлива: %d. ", distance, terrain, fuel);
            return true;
        }
        System.out.printf("Недостаточно топлива! Нужно: %d, осталось: %d. ", consumption, fuel);
        return false;
    }
}