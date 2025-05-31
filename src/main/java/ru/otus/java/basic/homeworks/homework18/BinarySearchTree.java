package ru.otus.java.basic.homeworks.homework18;
import java.util.ArrayList;
import java.util.List;

interface SearchTree<T> {
    T find(T element);
    List<T> getSortedList();
}

public class BinarySearchTree<T extends Comparable<T>> implements SearchTree<T> {

    private static class Node<T> {
        T data;
        Node<T> left;
        Node<T> right;

        Node(T data) {
            this.data = data;
        }
    }

    private Node<T> root;

    // Конструктор строит сбалансированное дерево из отсортированного списка
    public BinarySearchTree(List<T> sortedList) {
        if (sortedList != null && !sortedList.isEmpty()) {
            this.root = buildTree(sortedList, 0, sortedList.size() - 1);
        }
    }

    // Рекурсивное построение BST из отсортированного списка
    private Node<T> buildTree(List<T> sortedList, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = start + (end - start) / 2;
        Node<T> node = new Node<>(sortedList.get(mid));
        node.left = buildTree(sortedList, start, mid - 1);
        node.right = buildTree(sortedList, mid + 1, end);
        return node;
    }

    // Поиск элемента в дереве
    @Override
    public T find(T element) {
        return find(root, element);
    }

    // Рекурсивная функция поиска
    private T find(Node<T> node, T element) {
        if (node == null) {
            return null;
        }
        int cmp = element.compareTo(node.data);
        if (cmp == 0) {
            return node.data;
        }
        return cmp < 0 ? find(node.left, element) : find(node.right, element);
    }

    // Получение элементов в отсортированном порядке
    @Override
    public List<T> getSortedList() {
        List<T> sortedList = new ArrayList<>();
        inOrderTraversal(root, sortedList);
        return sortedList;
    }

    // In-order обход для получения отсортированного списка
    private void inOrderTraversal(Node<T> node, List<T> list) {
        if (node != null) {
            inOrderTraversal(node.left, list);
            list.add(node.data);
            inOrderTraversal(node.right, list);
        }
    }

    // Пример использования
    public static void main(String[] args) {
        List<Integer> sortedList = List.of(1, 2, 3, 4, 5, 6, 7);
        BinarySearchTree<Integer> tree = new BinarySearchTree<>(sortedList);

        System.out.println("Поиск 4: " + tree.find(4)); // 4
        System.out.println("Поиск 8: " + tree.find(8)); // null

        System.out.println("Отсортированный список: " + tree.getSortedList());
    }
}
