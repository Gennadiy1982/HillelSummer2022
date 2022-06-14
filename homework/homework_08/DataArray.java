package homework_08;

import java.util.Arrays;

public class DataArray implements Collection {

    private final String[] array;
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
        if (value != null || array[index] == null) {
            array[index] = value;
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
        return array[index];
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
        for (int i = 0; i < array.length; i++) {
            array[i] = null;
        }
        return true;
    }

    @Override
    public int size() {
        return array.length;
    }
}



