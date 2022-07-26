package homework_09;

import java.util.ArrayList;
import java.util.Collection;

public class Run {

    public static void main(String[] args) {

        CustomServiceImpl<String> service = new CustomServiceImpl<>();

        Collection<String> price = new ArrayList<>();
        price.add("23");
        price.add("95");
        price.add("978");

        System.out.println(service.add("1982"));
        System.out.println(service.add("2390"));
        System.out.println(service.add("9090"));
        System.out.println(service.add("1090"));
        System.out.println(service.delete(2));
        System.out.println(service.delete("1090"));
        System.out.println(service.size());
        System.out.println(service.get(0));
        System.out.println(service.contains("239000"));
        System.out.println(service.trim());
        System.out.println(service.clear());
        System.out.println(service.size());
        System.out.println(service.addAll(price));
    }
}
