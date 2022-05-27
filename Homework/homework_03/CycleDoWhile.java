package homework_03;

public class CycleDoWhile {
    public static void main(String[] args) {
        int i = 0;
        do {
            i = i + 1;
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        } while (i <= 99);
    }
}
