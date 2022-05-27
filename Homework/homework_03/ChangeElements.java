package homework_03;

public class ChangeElements {
    public static void main(String[] args) {
        int[] array = new int[]{25, 45, -34, 12, 8, 0, -67, -4};
        int minValue = array[0];
        int maxValue = array[0];
        int minValueIndex = 0;
        int maxValueIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (minValue < array[i]) {
                minValueIndex = i;
                minValue = array[i];
            }
            if (maxValue > array[i]) {
                maxValueIndex = i;
                maxValue = array[i];
            }
        }
        int temp = array[maxValueIndex];
        array[maxValueIndex] = array[minValueIndex];
        array[minValueIndex] = temp;
        for (int j : array) {
            System.out.print(j + " ");
        }
    }
}
