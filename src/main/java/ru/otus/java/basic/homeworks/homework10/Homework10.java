package ru.otus.java.basic.homeworks.homework10;

public class Homework10 {


    public static void main(String[] args) {
        Box myBox = new Box(30, 20, 10, "красный");
        myBox.printInform();
        myBox.open();
        myBox.putItem("Книга");
        myBox.putItem("Чашка");
        myBox.close();
        myBox.printInform();
        myBox.open();
        myBox.removeItem();
        myBox.removeItem();
        myBox.repaint("Синий");
        myBox.printInform();

        User user = new User("Иванова", "Мария", "Петровна", 1975, "maria@mail.ru");

        user.printUserInfo();
        System.out.println();

        User[] users = new User[10];
        users[0] = new User("Петров", "Иван", "Иванович", 1977, "ivanov@mail.ru");
        users[1] = new User("Сидоров", "Семен", "Сергеевич", 1980, "sema@mail.ru");
        users[2] = new User("Павлова", "Анна", "Николаевна", 1965, "anna@mail.ru");
        users[3] = new User("Васильев", "Вячеслав", "Сергеевич", 1991, "slava@mail.ru");
        users[4] = new User("Потапова", "Ольга", "Владимировна", 2004, "olga@mail.ru");
        users[5] = new User("Мишин", "Олег", "Иванович", 2010, "oleg@mail.ru");
        users[6] = new User("Новиков", "Михаил", "Павлович", 1995, "novik@mail.ru");
        users[7] = new User("Орлов", "Павел", "Игнатьевич", 1958, "pavel@mail.ru");
        users[8] = new User("Соколов", "Виктор", "Семенович", 2005, "sokol@mail.ru");
        users[9] = new User("Федоров", "Игорь", "Васильевич", 1998, "fedor@mail.ru");

        System.out.println("Пользователи старше 40 лет: ");
        System.out.println("____________________________");

        for (int i = 0; i < users.length; i++) {
            User currentUser = users[i];
            final int CURRENT_YEAR = 2025;
            int age = CURRENT_YEAR - currentUser.getYearOfBirth();
            if (age > 40) {
                currentUser.printUserInfo();
                System.out.println("____________________________");
            }
        }
    }
}




