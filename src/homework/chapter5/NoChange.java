package homework.chapter5;

public class NoChange {
    public static void main(String[] args) {
        int[] nums = {44, 12, 5, 6, 8, 33, 48};
        for (int x : nums) {
            System.out.print(x + " ");
            x = x * 10;
        }
        System.out.println();
        for (int x : nums) {
            System.out.print(x + " ");
        }
    }
}
