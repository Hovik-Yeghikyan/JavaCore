package homework1.dynamicarray;

public class DynamicArray {
    private int[] array = new int[10];
    private int size = 0;

    public void add(int value) {
        if (size > array.length - 1) {
            extend();
        }
        array[size] = value;
        size++;
    }

    private void extend() {

        int[] newArray = new int[array.length + 10];

        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    public int getByIndex(int index) {
        for (int i = 0; i < array.length; i++) {
            if (index == i) {
                return array[index];
            }
        }
        return -1;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public void deleteByIndex(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size; i++) {

                array[i] = array[i + 1];
                size--;
            }
        } else {
            System.out.println("incurrect index");
        }

    }

    public void set(int index, int value) {
        if (index >= 0 && index < size) {
            array[index] = value;
        } else {
            System.out.println("incurrect index");
        }
    }

    public void add(int index, int value) {
        int temp = 0;
        if (index >= 0 && index < size) {
            size++;
            for (int i = size; i > index; i--) {
                temp = array[i];
                array[i] = array[i - 1];
                array[i - 1] = temp;
            }
            array[index] = value;
        } else {
            System.out.println("incurrect index");
        }
    }

    public boolean exists(int value) {
        for (int i = 0; i < size; i++) {
            if (value == array[i]) {
                return true;
            }
        }
        return false;
    }

    public int getIndexByValue(int value) {
        int tmp;
        for (tmp = 0; tmp < size; tmp++) {
            if (array[tmp] == value) {
                return tmp;
            }
        }
        if (array[tmp] != value) {
            return -1;
        }

        return 0;
    }
}



