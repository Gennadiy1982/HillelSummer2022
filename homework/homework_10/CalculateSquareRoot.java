package homework_10;

import java.util.Scanner;

public class CalculateSquareRoot {

    public static void main(String[] args) {
        double a, b, c;
        double d;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение a: ");
        a = scanner.nextDouble();
        System.out.println("Введите значение b: ");
        b = scanner.nextDouble();
        System.out.println("Введите значение c: ");
        c = scanner.nextDouble();

        d = b * b - 4 * a * c;

        if (d > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(d)) / (2 * a);
            x2 = (-b + Math.sqrt(d)) / (2 * a);
            System.out.println("Результат: x1 = " + x1 + "; x2 = " + x2);
        } else if (d == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("Уравнение имеет единственный корень: x = " + x);
        } else {
            System.out.println("Не имеет решения");
        }
    }
}
