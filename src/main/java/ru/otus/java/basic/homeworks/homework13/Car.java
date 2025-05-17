package ru.otus.java.basic.homeworks.homework13;

public class Car implements Transport {
    private int fuel;

    public Car(int fuel) {
        this.fuel = fuel;
    }

    @Override
    public boolean canMove(TerrainType terrain) {
        return terrain != TerrainType.FOREST && terrain != TerrainType.SWAMP;
    }

    @Override
    public boolean move(int distance, TerrainType terrain) {
        if (!canMove(terrain)) {
            System.out.print("Машина не может ехать по " + terrain + ". ");
            return false;
        }

        int consumption = distance;
        if (fuel >= consumption) {
            fuel -= consumption;
            System.out.printf("Машина проехала %d км по %s. Осталось топлива: %d. ", distance, terrain, fuel);
            return true;
        }
        System.out.printf("Недостаточно топлива! Нужно: %d, осталось: %d. ", consumption, fuel);
        return false;
    }

}
