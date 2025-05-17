package ru.otus.java.basic.homeworks.homework13;

public class Homework13 {
    public static void main(String[] args) {
        Human human = new Human("Иван");

        // Пешее перемещение
        human.move(5, TerrainType.PLAIN);

        // На машине
        Car car = new Car(15);
        human.setCurrentTransport(car);
        human.move(3, TerrainType.FOREST);
        human.move(5, TerrainType.PLAIN);

        // На лошади
        Horse horse = new Horse(20);
        human.setCurrentTransport(horse);
        human.move(4, TerrainType.SWAMP);
        human.move(3, TerrainType.FOREST);

        // На велосипеде
        human.setCurrentTransport(new Bicycle());
        human.move(2, TerrainType.SWAMP);
        human.move(10, TerrainType.PLAIN);

        // На вездеходе
        AllTerrainVehicle atv = new AllTerrainVehicle(30);
        human.setCurrentTransport(atv);
        human.move(15, TerrainType.SWAMP);
    }

}
