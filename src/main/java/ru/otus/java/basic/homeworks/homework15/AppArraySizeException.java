package ru.otus.java.basic.homeworks.homework15;

public class AppArraySizeException extends Exception {
    public AppArraySizeException() {
        super("Некорректный размер массива. Требуется массив 4x4.");
    }
}

