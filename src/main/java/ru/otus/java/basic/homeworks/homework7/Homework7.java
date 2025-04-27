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

        int[]arr1={1,2,3,5,8};
        int max=max(arr1);
        System.out.println("Максимальный элемент массива: " + max);

        int[][] matrix1 = {{1,2,3},{4,5,6}};
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
        if (matrix==null){
            System.out.println("Массив : null");
            return;
        }
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i]==null || i>=matrix[i].length){
                continue;
            }
            matrix[i][i]=0;
        }
        System.out.println("Результат: ");
        for(int[]row : matrix){
            if (row==null){
                System.out.println("null");
                continue;
            }
            for (int num : row){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
    public static int max(int[]arr){
        int max = arr[0];
        for (int elem : arr){
            if (elem>max){
                max=elem;
            }
        }
        return max;
    }
    public static int sumOfSecondRow(int[] [] array){
        if (array==null || array.length<2){
            return -1;
        }
        int[]secondRow = array[1];
        if (secondRow==null){
            return -1;
        }
        int sum=0;
        for (int num:secondRow){
            sum+=num;
        }
        return sum;
    }
}
