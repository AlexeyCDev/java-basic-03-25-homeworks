package ru.otus.java.basic.homeworks.homework15;

public class AppArrayDataException extends Exception {
    public AppArrayDataException(int row, int col) {
        super(String.format("Неверные данные в ячейке [%d][%d]", row, col));
    }
}