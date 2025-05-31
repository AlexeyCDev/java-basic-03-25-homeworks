package ru.otus.java.basic.homeworks.homework17;

import java.util.*;

public class PhoneBook {
    private final Map<String, Set<String>> nameToPhones;
    private final Set<String> allPhoneNumbers;

    public PhoneBook() {
        nameToPhones = new HashMap<>();
        allPhoneNumbers = new HashSet<>();
    }

    public void add(String name, String phoneNumber) {
        nameToPhones.computeIfAbsent(name, k -> new LinkedHashSet<>()).add(phoneNumber);
        allPhoneNumbers.add(phoneNumber);
    }

    public List<String> find(String name) {
        Set<String> phones = nameToPhones.get(name);
        return phones == null ? new ArrayList<>() : new ArrayList<>(phones);
    }

    public boolean containsPhoneNumber(String phoneNumber) {
        return allPhoneNumbers.contains(phoneNumber);
    }
}
