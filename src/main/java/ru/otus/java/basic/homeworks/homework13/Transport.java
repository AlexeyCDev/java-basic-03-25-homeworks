package ru.otus.java.basic.homeworks.homework13;

public interface Transport {
    boolean move(int distance, TerrainType terrain);

    boolean canMove(TerrainType terrain);
}
