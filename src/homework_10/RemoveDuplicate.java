package homework_10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicate {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("1");
        list.add("1");
        list.add("2");
        list.add("2");
        list.add("3");
        list.add("3");
        list.add("9");

        for (String s : list) {
            System.out.print(s + " ");

        }
        System.out.println();

        HashSet<String> hashSet = new HashSet<>(list);

        list.clear();

        list.addAll(hashSet);

        for (String s : hashSet){
            System.out.print(s + " ");
        }
    }
}
