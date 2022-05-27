package homework_03;

public class CycleWhileFactorial {
    public static void main(String[] args) {
        int number = 7;
        int i = 1;
        int factorial = 1;
        while (i <= number) {
            factorial *= i;
            i++;
        }
        System.out.println(factorial);
    }
}
