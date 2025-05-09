package ru.otus.java.basic.homeworks.homework11;

public class Horse extends Animal {
    public Horse(String name, int runSpeed, int swimSpeed, int endurance) {
        super(name, runSpeed, swimSpeed, endurance);
    }

    @Override
    public int getSwimEnduranceCost() {
        return 4;
    }
}
