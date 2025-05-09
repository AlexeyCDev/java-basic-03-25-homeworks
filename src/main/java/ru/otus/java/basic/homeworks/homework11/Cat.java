package ru.otus.java.basic.homeworks.homework11;

public class Cat extends Animal {
    public Cat(String name, int runSpeed, int endurance) {
        super(name, runSpeed, 0, endurance);
    }

    @Override
    public int getSwimEnduranceCost() {
        return 0;
    }

}
