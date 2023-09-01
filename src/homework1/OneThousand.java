package homework1;

public class OneThousand {
    public static void main(String[] args) {
        int[] numbers = new int[1000];
        int i, j = 1;
        for (i = 0; i < numbers.length; i++) {
            numbers[i] = j;
            j++;
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print("-");
            }
        }
    }
}