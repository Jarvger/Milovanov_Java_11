package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите номер этапа (1, 2 или 3): ");
        int stage = scanner.nextInt();

        switch (stage) {
            case 1:
                stageOne(scanner);
                break;
            case 2:
                stageTwo(scanner);
                break;
            case 3:
                stageThree();
                break;
            default:
                System.out.println("Некорректный номер этапа.");
                break;
        }
    }

    public static void stageOne(Scanner scanner) {
        System.out.println("Введите два целых числа:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // Сравнение чисел
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        // Операции с числами
        System.out.println("Сумма: " + (a + b));
        System.out.println("Разность: " + (a - b));
        System.out.println("Произведение: " + (a * b));
        System.out.println("Частное: " + (a / b));
    }

    public static void stageTwo(Scanner scanner) {
        System.out.println("Введ ите две строки:");
        String a = scanner.next();
        String b = scanner.next();

        // Сравнение строк
        if (a.equals(b)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки не идентичны");
        }
    }

    public static void stageThree() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Вывод четных чисел
        System.out.println("Четные числа:");
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }
}