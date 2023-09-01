package homework1;

public class ModuleSample {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        int i, j = 1;
        for (i = 0; i < numbers.length; i++) {
            numbers[i] = j;
            j++;
            if (numbers[i] % 2 == 0) {
                System.out.print(numbers[i] + " ");
            }
        }
    }
}
