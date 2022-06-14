package homework_08;

public class Run {

    public static void main(String[] args) {

        int maxSize = 10;

        DataArray array = new DataArray(maxSize);
        DataArray array1 = new DataArray(maxSize);

        System.out.println(array.add(2, "Кафка"));
        System.out.println(array.add("Оруэлл"));
        System.out.println(array.delete("Фрэйд"));
        System.out.println(array.get(7));
        System.out.println(array.contain("Юнг"));
        System.out.println(array.equals(array1));
        System.out.println(array.clear());
        System.out.println(array.size());
    }
}

