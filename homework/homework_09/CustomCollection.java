package homework_09;


import java.util.Collection;

public interface CustomCollection<String> {

    boolean add(String str);

    boolean addAll(Collection strCol);

    boolean delete(int index);

    boolean delete(String str);

    String get(int index);

    boolean contains(String str);

    boolean clear();

    int size();

    boolean trim();
}