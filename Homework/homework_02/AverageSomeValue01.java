package homework_02;

import java.util.Scanner;

public class AverageSomeValue01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int sum = 0;
        double average;
        int counter;
        System.out.println("Количество элементов: ");
        counter = scanner.nextInt();
        System.out.println("Значения элементов: ");
        for (int i = 1;i <=counter;i++) {
            number = scanner.nextInt();
            sum += number;
        }
        average = (double) sum / counter;
        System.out.println("Среднее значение: " + average);
    }
}
