package ru.otus.java.basic.homeworks.homework11;

abstract class Animal {
    protected String name;
    protected int runSpeed;
    protected int swimSpeed;
    protected int endurance;
    protected boolean isTired;

    public Animal(String name, int runSpeed, int swimSpeed, int endurance) {
        this.name = name;
        this.runSpeed = runSpeed;
        this.swimSpeed = swimSpeed;
        this.endurance = endurance;
        this.isTired = false;
    }

    public double run(int distance) {
        int requiredEndurance = distance;
        if (endurance >= requiredEndurance) {
            endurance -= requiredEndurance;
            double time = (double) distance / runSpeed;
            System.out.println(name + " пробежал " + distance + " m за " + time + " сек ");
            isTired = false;
            return time;
        } else {
            System.out.println(name + " не может пробежать " + distance + " m. Недостаточно выносливости. ");
            isTired = true;
            return -1;
        }
    }

    public double swim(int distance) {
        if (swimSpeed == 0) {
            System.out.println(name + " не умеет плавать.");
            return -1;
        }
        int requiredEndurance = distance * getSwimEnduranceCost();
        if (endurance >= requiredEndurance) {
            endurance -= requiredEndurance;
            double time = (double) distance / swimSpeed;
            System.out.println(name + " проплыл " + distance + " m. за " + time + " сек. ");
            isTired = false;
            return time;
        } else {
            System.out.println(name + " не может проплыть " + distance + " m. Недостаточно выносливости. ");
            isTired = true;
            return -1;
        }
    }

    public abstract int getSwimEnduranceCost();

    public void info() {
        System.out.println(" Состояние " + name + ":");
        System.out.println(" Выносливость: " + endurance);
        System.out.println(" Состояние: " + (isTired ? "устал" : "бодр"));
    }
}
