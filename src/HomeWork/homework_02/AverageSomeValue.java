package HomeWork.homework_02;

public class AverageSomeValue {
    public static void main(String[] args) {
        int[] array = new int[7];
        int sum = 0;
        double average;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            sum += array[i];
        }
        average =(double) sum / array.length;
        System.out.printf("Среднее значение: %.3f",average);
    }
}
