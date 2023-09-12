package homework1;

public class Sort {
    public static void main(String[] args) {
        int[] array = {4, 7, 1, 3, 9, 0, 2};
        int sum;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    sum = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = sum;
                }
            }
        }
        for (int sort : array) {
            System.out.print(sort + " ");
        }
    }
}
