package ru.otus.java.basic.homeworks.homework5;

public class Homework5 {
    public static void main(String[] args) {

        textPrinting("Hello Java!", 5);

        int[] testArray = {2, 7, 10, 9, 3};
        sumAndPrint(testArray);

        int[] myArray = new int[5];
        fillArray(7, myArray);

        int[] number = {1, 2, 3, 4, 5};
        addValueToArrayElements(10, number);


        int[] arr1 = {1, 2, 3, 4,};//Четная длина
        printLargerHalfSum(arr1);

        int[] arr2 = {5, 3, 1};//Нечетная длина
        printLargerHalfSum(arr2);

        int[] arr3 = {4, 4};//Равные суммы
        printLargerHalfSum(arr3);
    }

    public static void textPrinting(String text, int counter) {
        for (int i = 0; i < counter; i++) {
            System.out.println(text);
        }
    }

    public static void sumAndPrint(int[] array) {
        int sum = 0;
        for (int num : array) {
            if (num > 5) {
                sum += num;
            }
        }
        System.out.println("Сумма элементов больше 5 : " + sum);
    }

    public static void fillArray(int number, int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = number;
        }
    }

    public static void addValueToArrayElements(int value, int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] += value;
        }
    }

    public static void printLargerHalfSum(int[] array) {
        int length = array.length;
        int mid = (length + 1) / 2;
        int sumFirst = 0;
        int sumSecond = 0;
        //Сумма первой половины
        for (int i = 0; i < mid; i++) {
            sumFirst += array[i];
        }
        //Сумма второй половины
        for (int i = mid; i < length; i++) {
            sumSecond += array[i];
        }
        if (sumFirst > sumSecond) {
            System.out.println("Первая половина больше: " + sumFirst + " > " + sumSecond);
        } else if (sumSecond > sumFirst) {
            System.out.println("Вторая половина больше: " + sumSecond + " > " + sumFirst);

        } else {
            System.out.println("Суммы половин равны: " + sumFirst);
        }
    }
}


