package homework_03;

public class CycleWhile {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 99) {
            i = i + 1;
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
