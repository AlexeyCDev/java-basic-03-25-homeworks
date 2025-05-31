package ru.otus.java.basic.homeworks.homework17;

public class Homework17 {
    public static void main(String[] args) {
        PhoneBook book = new PhoneBook();
        book.add("Alice", "123");
        book.add("Alice", "456");
        book.add("Bob", "789");
        book.add("Alice", "123");

        System.out.println(book.find("Alice"));
        System.out.println(book.find("Bob"));
        System.out.println(book.find("Eve"));

        System.out.println(book.containsPhoneNumber("123"));
        System.out.println(book.containsPhoneNumber("999"));
    }
}
