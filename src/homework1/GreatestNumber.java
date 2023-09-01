package homework1;

public class GreatestNumber {
    public static void main(String[] args) {
        int[] array = {2, 5, 8, 4, 9, 3, 7};
        int i, j = 0;
        for (i = 0; i < array.length; i++) {
            if (array[j] <= array[i]) {
                array[j] = array[i];
            }
        }
        System.out.println(array[j]);

    }
}

