package ru.otus.java.basic.homeworks.homework12;

public class Homework12 {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Barsik", 30),
                new Cat("Murzik", 50),
                new Cat("Vaska", 25)
        };
        Plate plate = new Plate(100);

        for (Cat cat : cats) {
            cat.eat(plate);
        }

        for (Cat cat : cats) {
            System.out.println(cat.getName() + " сыт? " + cat.isSatiety());
        }
    }
}
