package ru.otus.java.basic.homeworks.homework16;

import java.util.List;
import java.util.ArrayList;

public class Homework16 {
    public static List<Integer> generateSequence(int min, int max) {
        if (min > max) {
            throw new IllegalArgumentException("min должен быть <= max");
        }
        List<Integer> sequence = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            sequence.add(i);
        }
        return sequence;
    }


    public static int sumGreaterThanFive(List<Integer> numbers) {
        int sum = 0;
        for (int num : numbers) {
            if (num > 5) sum += num;
        }
        return sum;
    }

    public static void overwriteList(List<Integer> list, int number) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, number);
        }
    }


    public static void increaseListElements(List<Integer> list, int number) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) + number);
        }
    }

    public static List<String> getEmployeeNames(List<Employee> employees) {
        List<String> names = new ArrayList<>();
        for (Employee emp : employees) {
            names.add(emp.getName());
        }
        return names;
    }


    public static List<Employee> filterEmployeesByAge(List<Employee> employees, int minAge) {
        List<Employee> filtered = new ArrayList<>();
        for (Employee emp : employees) {
            if (emp.getAge() >= minAge) filtered.add(emp);
        }
        return filtered;
    }


    public static boolean isAverageAgeAbove(List<Employee> employees, double minAverageAge) {
        if (employees.isEmpty()) return false;
        double totalAge = 0;
        for (Employee emp : employees) {
            totalAge += emp.getAge();
        }
        return (totalAge / employees.size()) > minAverageAge;
    }


    public static Employee findYoungestEmployee(List<Employee> employees) {
        if (employees.isEmpty()) return null;
        Employee youngest = employees.get(0);
        for (Employee emp : employees) {
            if (emp.getAge() < youngest.getAge()) {
                youngest = emp;
            }
        }
        return youngest;
    }


    public static void main(String[] args) {

        List<Integer> sequence = generateSequence(3, 7);
        System.out.println("Последовательность: " + sequence);

        List<Integer> numbers = List.of(2, 6, 8, 3);
        System.out.println("Сумма >5: " + sumGreaterThanFive(numbers));

        overwriteList(new ArrayList<>(numbers), 10);
        increaseListElements(new ArrayList<>(List.of(1, 2, 3)), 5);

        List<Employee> employees = List.of(
                new Employee("Иван", 30),
                new Employee("Мария", 25)
        );
        System.out.println("Имена: " + getEmployeeNames(employees));
    }
}
