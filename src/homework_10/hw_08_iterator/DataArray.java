package homework_10.hw_08_iterator;

import java.util.Arrays;
import java.util.Objects;
import java.util.function.Consumer;

public class DataArray implements Collection, Iterator {

    private final String[] array;
    private int index;
    private int count;

    public DataArray(int max) {

        array = new String[max];
        count = 0;
    }

    @Override
    public boolean add(String value) {
        if (value != null || array[count] == null) {
            array[count] = value;
            count++;
            return true;
        }
        return false;
    }

    @Override
    public boolean add(int index, String value) {
        if (value != null || array[count] == null) {
            array[count] = value;
            count++;
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(String o) {
        for (int j = 0; j < array.length - 1; j++) {
            if (o.equals(array[j])) {
                for (int k = j; k < array.length - 1; k++) {
                    array[k] = array[k + 1];
                }
                count--;
                array[count] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public String get(int index) {
        for (int i = 0; i < array.length; i++) {
            if (index == i)
                return array[index];
        }
        return "Индекс не существует";
    }

    @Override
    public boolean contain(String o) {
        if (o == null) {
            for (String s : array) {
                if (s == null)
                    return true;
            }
        }
        for (String s : array) {
            if (o.equals(s))
                return true;
        }
        return false;
    }

    @Override
    public boolean equals(Collection str) {
        if (this == str) return true;
        if (str == null || getClass() != str.getClass()) return false;
        DataArray array1 = (DataArray) str;
        return count == array1.count && Arrays.equals(array, array1.array);
    }

    @Override
    public boolean clear() {
        String[] emptyArray;
        for (int i = 0; i < array.length; i++) {
            emptyArray = new String[array.length];
            for (int j = 0; j < i; j++) {
                array[j] = emptyArray[j];
            }
        }
        count = 0;
        return true;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean hasNext() {
        return index < count || array[index] != null;
    }

    @Override
    public void forEachRemaining(Consumer<String> action) {
        Objects.requireNonNull(action);
        while (hasNext())
            action.accept(next());
    }

    @Override
    public String next() {
        if (index < array.length) {
            return array[index++];
        }
        return "Список пуст";
    }

    @Override
    public void remove() {
        count--;
        index++;
    }
}






