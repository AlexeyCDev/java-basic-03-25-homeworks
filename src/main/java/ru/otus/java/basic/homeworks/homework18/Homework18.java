package ru.otus.java.basic.homeworks.homework18;
import java.util.Arrays;
import java.util.List;

public class Homework18 {
    public static void main(String[] args) {
        List<Integer> sortedList = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        BinarySearchTree<Integer> tree = new BinarySearchTree<>(sortedList);

        System.out.println(tree.find(3));
        System.out.println(tree.find(8));

        List<Integer> sorted = tree.getSortedList();
        System.out.println(sorted);
    }
}
