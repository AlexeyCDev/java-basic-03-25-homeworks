package ru.otus.java.basic.homeworks.homework7;

public class Homework7 {
    public static void main(String[] args) {

        int[][] arr = {{1, -2, 3}, {4, 5, 6}};
        int sum = sumOfPositiveElements(arr);
        System.out.println("Сумма положительных элементов: " + sum);

        printSquare(5);

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        zeroDiagonal(matrix);

        int[][] arr1 = {{1, 2}, {3, 4}};
        System.out.println(findMax(arr1));


        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(sumOfSecondRow(matrix1));
        int[][] matrix2 = {{2}};
        System.out.println(sumOfSecondRow(matrix2));

    }

    public static int sumOfPositiveElements(int[][] array) {
        int sum = 0;
        if (array == null) {
            return sum;
        }
        for (int[] row : array) {
            if (row != null) {
                for (int element : row) {
                    if (element > 0) {
                        sum += element;
                    }
                }
            }

        }
        return sum;
    }

    public static void printSquare(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("*  ");
            }
            System.out.println();

        }
    }

    public static void zeroDiagonal(int[][] matrix) {
        if (matrix == null) {
            return;
        }
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i] == null || i >= matrix[i].length) {
                continue;
            }
            matrix[i][i] = 0;
        }
        for (int[] row : matrix) {
            if (row == null) {
                continue;
            }
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static int findMax(int[][] array) {
        if (array == null || array.length == 0) {
            return Integer.MIN_VALUE;
        }
        int max = Integer.MIN_VALUE;
        for (int[] row : array) {
            if (row == null) {
                continue;
            }
            for (int num : row) {
                if (num > max) {
                    max = num;
                }
            }
        }
        return max;
    }

    public static int sumOfSecondRow(int[][] array) {
        if (array == null || array.length < 2 || array[1] == null) {
            return -1;
        }

        int sum = 0;
        for (int num : array[1]) {
            sum += num;
        }
        return sum;
    }
}
