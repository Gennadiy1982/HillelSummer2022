package homework_03_01;

public class HomeWork {
    public static void main(String[] args) {
        oddNumber();
        calculateFactorial();
        whileOddNumber();
        whileFactorial();
        doWhileOddNumbers();
        doWhileFactorial();
        involutionNumber();
        order();
        multiTable();
        minusNumbersArray();
        minValueArray();
        maxValueArray();
        swapValueArray();
        chessBoard();
    }

    public static void oddNumber() {
        System.out.println("Задание № 1: с помощью цикла for вывести нечетные числа в диапазоне от 1 до 99");
        System.out.println();
        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void calculateFactorial() {
        System.out.println();
        System.out.println("---------------------");
        System.out.println("Задание № 2: с помощью цикла for вычислить факториал числа");
        System.out.println();
        int number = 7;
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        System.out.println("Факториал числа 7 = " + result);
    }

    public static void whileOddNumber() {
        System.out.println();
        System.out.println("---------------------");
        System.out.println("Задание № 3_01:с помощью цикла while вывести нечетные числа в диапазоне от 1 до 99");
        System.out.println();
        int i = 0;
        while (i <= 99) {
            i = i + 1;
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void whileFactorial() {
        System.out.println();
        System.out.println("-----------------------");
        System.out.println("Задание № 3_02: с помощью цикла while вычислить факториал числа");
        System.out.println();
        int number = 7;
        int i = 1;
        int factorial = 1;
        while (i <= number) {
            factorial *= i;
            i++;
        }
        System.out.println("Факториал числа 7 = " + factorial);
    }

    public static void doWhileOddNumbers() {
        System.out.println();
        System.out.println("-------------------------");
        System.out.println("Задание № 4_01:с помощью цикла do while вывести нечетные числа в диапазоне от 1 до 99");
        System.out.println();
        int i = 0;
        do {
            i = i + 1;
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        } while (i <= 99);
    }

    public static void doWhileFactorial() {
        System.out.println();
        System.out.println("----------------------------");
        System.out.println("Задание № 4_02: с помощью цикла do while вычислить факториал числа");
        System.out.println();
        int i = 1;
        int number = 7;
        int factorial = 1;
        do {
            factorial *= i;
            i++;
        } while (i <= number);
        System.out.println("Факториал числа 7 = " + factorial);
    }

    public static void involutionNumber() {
        System.out.println();
        System.out.println("-------------------------");
        System.out.println("Задание № 5:есть две переменные X и N.Вычислить X^N");
        System.out.println();
        int x = 4;
        int n = 5;
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res *= x;
        }
        System.out.println("4 ^ 5 = " + res);
    }

    public static void order() {
        System.out.println();
        System.out.println("-----------------------");
        System.out.println("Задание № 6:вывести первые десять чисел последовательности 0, -5, -10, -15");
        System.out.println();
        int i = 0;
        for (int j = 1; j <= 10; j++) {
            System.out.print(i + " ");
            i -= 5;
        }
    }

    public static void multiTable() {
        System.out.println();
        System.out.println("-------------------------");
        System.out.println("Задание № 7:вывести таблицу умножения на Х,где Х любое число в диапазоне от 0 до 10");
        System.out.println();
        int i = 1;
        int n = 7;
        int result;
        System.out.println("Таблица умножения");
        while (i <= 9) {
            result = i * n;
            System.out.printf("%s * %s = %s\n", i, n, result);
            i++;
        }
    }

    public static void minusNumbersArray() {
        System.out.println();
        System.out.println("------------------------");
        System.out.println("Задание № 8:создать массив,содержащий 10 первых нечетных чисел." +
                "Вывести элементы массива в одну строку через запятую.");
        System.out.println();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (-10));
            System.out.print(array[i] + " ,");
        }
    }

    public static void minValueArray() {
        System.out.println();
        System.out.println("----------------------");
        System.out.println("Задание № 9:Дан массив размерности N,найти наименьший элемент" +
                "и вывести его в консоль.Массив заполнить случайными числами от 0 до 100");
        System.out.println();
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

    public static void maxValueArray() {
        System.out.println();
        System.out.println("-------------------------");
        System.out.println("Задание № 10:Дан массив размерности N,найти максимальный элемент" +
                "и вывести его в консоль.Массив заполнить случайными числами от 0 до 100");
        System.out.println();
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

    public static void swapValueArray() {
        System.out.println();
        System.out.println("------------------------");
        System.out.println("Задание № 11:поменять местами максимальный и минимальный элементы массива");
        System.out.println();
        int[] array = new int[]{25, 45, -34, 12, 8, 0, -67, -4};
        int minValue = array[0];
        int maxValue = array[0];
        int minValueIndex = 0;
        int maxValueIndex = 0;
        System.out.println("Исходный массив:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

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
        System.out.println();
        System.out.println("Измененный массив:");
        for (int j : array) {
            System.out.print(j + " ");
        }
    }

    public static void chessBoard() {
        System.out.println();
        System.out.println("-------------------------");
        System.out.println("Задание № 12:вывести на экран шахматную доску размером 8 х 8 в виде " +
                "двумерного массива.W - белые клетки,B - черные клетки");
        System.out.println();
        String[][] chess = new String[8][8];
        for (int i = 0; i < chess.length; i++) {
            for (int j = 0; j < chess[0].length; j++) {
                if ((i + j) % 2 == 0) {
                    chess[i][j] = "W";
                } else
                    chess[i][j] = "B";
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }
    }
}
