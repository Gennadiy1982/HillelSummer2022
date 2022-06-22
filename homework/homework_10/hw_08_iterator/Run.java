package homework_10.hw_08_iterator;

public class Run {

    public static void main(String[] args) {

        int maxSize = 10;

        DataArray array = new DataArray(maxSize);
        DataArray array1 = new DataArray(maxSize);

        System.out.println(array.add("Кафка"));
        System.out.println(array.add("Оруэлл"));
        System.out.println(array.add(5, "Фрейд"));

        System.out.println(array.size());
        System.out.println(array.hasNext());
//        System.out.println(array.next());
//        System.out.println(array.next());
//        System.out.println(array.next());
//        array.remove();
//        array.remove();
//        array.remove();
        System.out.println(array.size());
        array.forEachRemaining(System.out::println);
    }
}


