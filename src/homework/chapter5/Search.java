package homework.chapter5;

public class Search {
    public static void main(String[] args) {
        int[] nums = {6, 22, 35, 44, 88, 5, 7, 9};
        int val = 22;
        boolean found = false;
        for (int x : nums) {
            if (x == val) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("value is: " + val);
        } else {
            System.out.println("value is not supported");
        }
    }
}
