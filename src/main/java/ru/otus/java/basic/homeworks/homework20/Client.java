package ru.otus.java.basic.homeworks.homework20;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {
    private static final String HOST = "localhost";
    private static final int PORT = 12346;

    public static void main(String[] args) {
        try (
                Socket socket = new Socket(HOST, PORT);
                BufferedReader in = new BufferedReader(
                        new InputStreamReader(socket.getInputStream()));
                PrintWriter out = new PrintWriter(
                        socket.getOutputStream(), true);
                Scanner scanner = new Scanner(System.in);
        ) {
            System.out.println("Подключено к серверу");
            String helpMessage;
            while ((helpMessage = in.readLine()) != null) {
                System.out.println(helpMessage);
                if (helpMessage.contains("exit")) break;
            }

            while (true) {
                System.out.print("\nВведите выражение (например, 5+3) или 'exit': ");
                String userInput = scanner.nextLine().trim();

                if (userInput.equalsIgnoreCase("exit")) {
                    out.println("exit");
                    break;
                }

                String expression = userInput.replaceAll("\\s+", "");
                out.println(expression);

                String response = in.readLine();
                System.out.println(">> " + response);
            }
        } catch (UnknownHostException e) {
            System.err.println("Сервер не найден: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Ошибка подключения: " + e.getMessage());
        }
        System.out.println("Отключено от сервера");
    }
}
