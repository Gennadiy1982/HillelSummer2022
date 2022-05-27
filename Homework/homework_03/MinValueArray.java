package homework_03;

public class MinValueArray {
    public static void main(String[] args) {
        int[] array = new int[7];
        int minValue = 1000;
        System.out.println("Наш массив");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + " ");
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        System.out.println();
        System.out.println("Минимальное значение в массиве:" + minValue);
    }
}
