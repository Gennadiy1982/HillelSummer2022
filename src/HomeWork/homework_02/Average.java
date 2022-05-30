package HomeWork.homework_02;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        double average;
        System.out.println("Введите число: ");
        a = scanner.nextInt();
        System.out.println("Введите число: ");
        b = scanner.nextInt();
        average = (double) (a + b) / 2;
        System.out.println("Среднее значение: " + average);
    }
}
