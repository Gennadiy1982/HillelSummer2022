package homework_03;

public class CalcFactorialFor {
    public static void main(String[] args) {
        int number = 7;
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        System.out.println(result);
    }
}
