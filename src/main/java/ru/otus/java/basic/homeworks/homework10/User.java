package ru.otus.java.basic.homeworks.homework10;

public class User {
    private String lastName;
    private String firstName;
    private String patronymic;
    private int yearOfBirth;
    private String email;


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User(String lastName, String firstName, String patronymic, int yearOfBirth, String email) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.yearOfBirth = yearOfBirth;
        this.email = email;
    }

    public void printUserInfo() {
        System.out.println("ФИО: " + lastName + " " + firstName + " " + patronymic);
        System.out.println("Год рождения: " + yearOfBirth);
        System.out.println("email: " + email);
    }


}
