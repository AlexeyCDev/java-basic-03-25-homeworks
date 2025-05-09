package ru.otus.java.basic.homeworks.homework11;

public class Homework11 {
    public static void main(String[] args) {
        Dog dog=new Dog("Бобик",5,2,20);
        dog.run(5);
        dog.swim(2);
        dog.swim(10);
        Cat cat=new Cat("Барсик",5,3);
        cat.run(2);
        cat.run(2);
        Horse horse = new Horse("Ветер",10,5,30);
        horse.run(8);
        horse.run(10);
        horse.swim(3);
        horse.swim(10);
    }
}
