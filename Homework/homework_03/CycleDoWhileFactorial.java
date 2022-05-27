package homework_03;

public class CycleDoWhileFactorial {
    public static void main(String[] args) {
        int i = 1;
        int number = 7;
        int factorial = 1;
        do {
            factorial *= i;
            i++;
        } while (i <= number);
        System.out.println(factorial);
    }
}
