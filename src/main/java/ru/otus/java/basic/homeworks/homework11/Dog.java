package ru.otus.java.basic.homeworks.homework11;

public class Dog extends Animal {
    public Dog(String name, int runSpeed, int swimSpeed, int endurance) {
        super(name, runSpeed, swimSpeed, endurance);
    }

    @Override
    public int getSwimEnduranceCost() {
        return 2;
    }
}
