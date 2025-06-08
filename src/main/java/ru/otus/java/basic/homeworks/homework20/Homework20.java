package ru.otus.java.basic.homeworks.homework20;

import java.io.*;
import java.net.*;

public class Homework20 {
    private static final int PORT = 12346;
    private static final String HELP_MSG =
            "Доступные операции: + (сложение), - (вычитание), * (умножение), / (деление)\n" +
                    "Формат запроса: <число><операция><число> (пробелы необязательны)\n" +
                    "Примеры: 5+3, 10 / 2, 7.5 * 2\n" +
                    "Для выхода введите 'exit'";

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("Однопоточный сервер запущен на порту " + PORT);

            while (true) {
                System.out.println("\nОжидание подключения клиента...");
                try (Socket clientSocket = serverSocket.accept();
                     BufferedReader in = new BufferedReader(
                             new InputStreamReader(clientSocket.getInputStream()));
                     PrintWriter out = new PrintWriter(
                             clientSocket.getOutputStream(), true)) {

                    System.out.println("Клиент подключен: " + clientSocket.getInetAddress());
                    out.println(HELP_MSG);

                    String inputLine;
                    while ((inputLine = in.readLine()) != null) {
                        if (inputLine.equalsIgnoreCase("exit")) {
                            System.out.println("Клиент отключился");
                            break;
                        }

                        System.out.println("Получен запрос: '" + inputLine + "'");
                        try {
                            String expression = inputLine.replaceAll("\\s+", "");

                            int opIndex = -1;
                            char operation = '\0';
                            for (int i = 0; i < expression.length(); i++) {
                                char c = expression.charAt(i);
                                if (c == '+' || c == '-' || c == '*' || c == '/') {
                                    if (i == 0 && c == '-') continue;
                                    opIndex = i;
                                    operation = c;
                                    break;
                                }
                            }

                            if (opIndex == -1) {
                                throw new IllegalArgumentException("Не найден оператор");
                            }

                            String num1Str = expression.substring(0, opIndex);
                            String num2Str = expression.substring(opIndex + 1);

                            if (num1Str.isEmpty() || num2Str.isEmpty()) {
                                throw new IllegalArgumentException("Неверный формат чисел");
                            }

                            double num1 = Double.parseDouble(num1Str);
                            double num2 = Double.parseDouble(num2Str);
                            double result = calculate(num1, num2, operation);

                            String response = "Результат: " + result;
                            out.println(response);
                            System.out.println("Отправлен ответ: " + response);
                        } catch (Exception e) {
                            String errorMsg = "Ошибка: " + e.getMessage();
                            out.println(errorMsg);
                            System.out.println(errorMsg);
                        }
                    }
                } catch (IOException e) {
                    System.err.println("Ошибка обработки клиента: " + e.getMessage());
                }
            }
        } catch (IOException e) {
            System.err.println("Ошибка сервера: " + e.getMessage());
        }
    }

    private static double calculate(double a, double b, char op) {
        switch (op) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b == 0) throw new ArithmeticException("Деление на ноль");
                return a / b;
            default:
                throw new IllegalArgumentException("Недопустимая операция: " + op);
        }
    }
}
