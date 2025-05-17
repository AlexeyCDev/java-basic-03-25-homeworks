package ru.otus.java.basic.homeworks.homework13;

public class Human {
    private String name;
    private Transport currentTransport;

    public Human(String name) {
        this.name = name;
    }

    // Сесть на транспорт
    public void setCurrentTransport(Transport transport) {
        this.currentTransport = transport;
        System.out.println(name + " сел на " + transport.getClass().getSimpleName());
    }

    // Сойти с транспорта
    public void removeTransport() {
        if (currentTransport != null) {
            System.out.println(name + " сошел с " + currentTransport.getClass().getSimpleName());
            currentTransport = null;
        }
    }

    // Переместиться
    public boolean move(int distance, TerrainType terrain) {
        if (currentTransport == null) {
            System.out.println(name + " прошел " + distance + " км пешком по " + terrain);
            return true;
        }

        boolean result = currentTransport.move(distance, terrain);
        System.out.println(name + (result ? " успешно" : " не смог")
                + " переместился на " + currentTransport.getClass().getSimpleName());
        return result;
    }
}
