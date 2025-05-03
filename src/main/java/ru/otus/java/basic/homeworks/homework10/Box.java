package ru.otus.java.basic.homeworks.homework10;

public class Box {
    private final int length;
    private final int width;
    private final int height;
    private String color;
    private boolean isOpen;
    private String item;

    public Box(int length, int width, int height, String color) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.color = color;
        this.isOpen = false;
        this.item = null;
    }

    public void open() {
        if (!isOpen) {
            isOpen = true;
            System.out.println("Коробка открыта. ");
        } else {
            System.out.println("Коробка уже была открыта. ");
        }
    }

    public void close() {
        if (isOpen) {
            isOpen = false;
            System.out.println("Коробка закрыта. ");
        } else {
            System.out.println("Коробка уже была закрыта. ");
        }
    }

    public void repaint(String newColor) {
        this.color = newColor;
        System.out.println("Коробка перекрашена в " + newColor + ".");
    }

    public void printInform() {
        System.out.println("Информация о коробке: ");
        System.out.println("Размеры: " + length + "X" + width + "X" + height);
        System.out.println("Цвет: " + color);
        System.out.println("Состояние: " + (isOpen ? "открыта" : "закрыта"));
        System.out.println("Содержимое: " + (item != null ? item : "пусто"));
        System.out.println("------------------------");
    }

    public void putItem(String item) {
        if (!isOpen) {
            System.out.println("[ Ошибка ]Невозможно положить предмет: коробка закрыта!");
            return;
        }
        if (this.item == null) {
            this.item = item;
            System.out.println("В коробку помещен предмет: " + item);
        } else {
            System.out.println("[ Ошибка ] В коробке уже находится: " + this.item);
        }


    }

    public void removeItem() {
        if (!isOpen) {
            System.out.println("[ Ошибка ]Невозможно извлечь предмет: коробка закрыта!");
            return;
        }
        if (item != null) {
            String removedItem = item;
            item = null;
            System.out.println("Из коробки извлечен предмет: " + removedItem);
        } else {
            System.out.println("[ Ошибка ] В коробке нет предметов");
        }
    }

}
