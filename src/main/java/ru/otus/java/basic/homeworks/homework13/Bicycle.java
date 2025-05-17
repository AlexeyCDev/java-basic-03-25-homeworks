package ru.otus.java.basic.homeworks.homework13;

public class Bicycle implements Transport {
    @Override
    public boolean canMove(TerrainType terrain) {
        return terrain != TerrainType.SWAMP;
    }

    @Override
    public boolean move(int distance, TerrainType terrain) {
        if (!canMove(terrain)) {
            System.out.print("Велосипед не может ехать по " + terrain + ". ");
            return false;
        }
        System.out.printf("Велосипед проехал %d км по %s. ", distance, terrain);
        return true;
    }
}



