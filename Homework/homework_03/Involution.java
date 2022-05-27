package homework_03;

public class Involution {
    public static void main(String[] args) {
        int x = 4;
        int n = 5;
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res *= x;
        }
        System.out.println(res);
    }
}
