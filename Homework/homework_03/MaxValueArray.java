package homework_03;

public class MaxValueArray {
    public static void main(String[] args) {
        int[] array = new int[7];
        int maxValue = 0;
        System.out.println("Наш массив");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + " ");
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        System.out.println();
        System.out.println("Максимальное значение в массиве:" + maxValue);
    }
}
