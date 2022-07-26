package homework_07;

public class ServiceMyArray implements AddGetDelete {

    private final String[] array;
    private int countElements;

    public ServiceMyArray(int max) {
        array = new String[max];
        countElements = 0;
    }

    @Override
    public boolean add(int index, String value) {
        if (value != null || array[index] == null) {
            array[index] = value;
            countElements++;
            return true;
        } else
            return false;
    }

    @Override
    public boolean add(String value) {
        if (value != null || array[countElements] == null) {
            array[countElements] = value;
            countElements++;
            return true;
        } else
            return false;
    }

    @Override
    public boolean delete(int index) {
        for (int j = index; j < array.length - 1; j++) {
            array[j] = array[j + 1];
            countElements--;
        }
        return true;
    }

    @Override
    public boolean delete(String value) {
        for (int i = 0; i < array.length - 1; i++) {
            if (value.equals(array[i]))
                array[i] = null;
            countElements--;
        }
        return true;
    }

    @Override
    public String get(int index) {
        return array[index];
    }

    @Override
    public void printInfo() {
        for (String s : array) {
            System.out.print(s + " ");
        }
    }
}
