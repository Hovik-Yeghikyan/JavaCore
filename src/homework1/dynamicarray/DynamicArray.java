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

        int[] newArray = new int[2 * array.length];

        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    public int getByArray(int index) {
        for (int i = 0; i < array.length; i++) {
            if (index == i) {
                return array[index];
            }
        }
        return -1;
    }

    public void print() {
        for (int i = 10; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
