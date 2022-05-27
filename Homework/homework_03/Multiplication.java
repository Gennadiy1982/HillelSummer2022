package homework_03;

public class Multiplication {
    public static void main(String[] args) {
        int i = 1;
        int n = 7;
        int result;
        System.out.println("Таблица умножения");
        while (i <= 9) {
            result = i * n;
            System.out.printf("%s * %s = %s\n", i, n, result);
            i++;
        }
    }
}
