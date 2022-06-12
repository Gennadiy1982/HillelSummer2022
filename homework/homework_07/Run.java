package homework_07;

public class Run {

   static int maxSize = 10;
   static int indexForGet = 3;
   static int indexForAdd = 6;
   static int indexForAdd2 = 7;
   static int indexForAdd3 = 8;
   static int indexForDelete = 2;
   static String name1 = "Лавкрафт";
   static String name2 = "По";
   static String name3 = "Кинг";
   static String name4 = "Маркс";
   static String name5 = "Азимов";
   static String name6 = "Стругацкие";

    public static void main(String[] args) {

        ServiceMyArray myArray = new ServiceMyArray(maxSize);

        System.out.println("Пустой массив: ");
        System.out.println("----------------");
        myArray.printInfo();
        System.out.println();

        myArray.add(name1);
        myArray.add(name2);
        myArray.add(name3);
        myArray.add(name4);

        myArray.add(indexForAdd2, name5);
        myArray.add(indexForAdd, name6);
        myArray.add(indexForAdd3,name5);

        System.out.println();
        System.out.println("Проверка метода add: ");
        System.out.println("----------------------");
        myArray.printInfo();
        System.out.println();

        System.out.println();
        System.out.println("Проверка метода get: ");
        System.out.println("---------------------");
        System.out.println(myArray.get(indexForGet));
        System.out.println();

        System.out.println("Проверка метода delete: ");
        System.out.println("------------------------");
        myArray.delete(indexForDelete);
        myArray.printInfo();
        System.out.println();
        myArray.delete(name5);
        myArray.printInfo();
    }
}
