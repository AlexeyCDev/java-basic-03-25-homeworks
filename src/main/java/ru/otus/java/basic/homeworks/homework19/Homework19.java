package ru.otus.java.basic.homeworks.homework19;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Homework19 {
    private static final Path ROOT_DIR = Paths.get(System.getProperty("user.dir"));
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            List<Path> textFiles = getTextFiles();

            if (textFiles.isEmpty()) {
                System.out.println("В корневом каталоге нет текстовых файлов.");
                return;
            }

            System.out.println("Список текстовых файлов:");
            textFiles.forEach(file -> System.out.println("> " + file.getFileName()));

            Path selectedFile = selectFile(textFiles);

            readAndDisplayFile(selectedFile);

            writeToFile(selectedFile);

        } catch (IOException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }

    private static List<Path> getTextFiles() throws IOException {
        try (Stream<Path> paths = Files.list(ROOT_DIR)) {
            return paths
                    .filter(Files::isRegularFile)
                    .filter(p -> p.toString().toLowerCase().endsWith(".txt"))
                    .collect(Collectors.toList());
        }
    }

    private static Path selectFile(List<Path> files) {
        while (true) {
            System.out.print("\nВведите имя файла: ");
            String fileName = scanner.nextLine().trim();

            if (!fileName.toLowerCase().endsWith(".txt")) {
                fileName += ".txt";
            }

            Path result = ROOT_DIR.resolve(fileName);
            if (files.contains(result)) {
                return result;
            }

            System.out.println("Файл не найден! Попробуйте снова.");
        }
    }

    private static void readAndDisplayFile(Path file) throws IOException {
        System.out.println("\nСодержимое файла " + file.getFileName() + ":");
        if (Files.size(file) > 0) {
            Files.lines(file).forEach(System.out::println);
        } else {
            System.out.println("<Файл пуст>");
        }
        System.out.println("\nВведите текст для записи (exit для выхода):");
    }

    private static void writeToFile(Path file) {
        try (BufferedWriter writer = Files.newBufferedWriter(
                file, StandardOpenOption.APPEND, StandardOpenOption.CREATE)) {

            while (true) {
                System.out.print("> ");
                String input = scanner.nextLine();

                if ("exit".equalsIgnoreCase(input)) {
                    System.out.println("Завершение работы.");
                    break;
                }

                writer.write(input);
                writer.newLine();
                writer.flush();
                System.out.println("Текст добавлен в файл.");
            }
        } catch (IOException e) {
            System.err.println("Ошибка записи: " + e.getMessage());
        }
    }
}


