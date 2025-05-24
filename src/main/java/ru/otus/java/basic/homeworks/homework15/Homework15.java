package ru.otus.java.basic.homeworks.homework15;

public class Homework15 {
    public static void main(String[] args) {
        String[][] array = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            int sum = sumArray(array);
            System.out.println("Сумма элементов: " + sum);
        } catch (AppArraySizeException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (AppArrayDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static int sumArray(String[][] array) throws AppArraySizeException, AppArrayDataException {

        if (array.length != 4) {
            throw new AppArraySizeException();
        }
        for (String[] row : array) {
            if (row.length != 4) {
                throw new AppArraySizeException();
            }
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new AppArrayDataException(i, j);
                }
            }
        }
        return sum;
    }
}
