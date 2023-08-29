package homework;

public class ArrayNew {
    public static void main(String[] args) {
        int i,j;
        int[] nums = new int[5];
        nums[0] = -7;
        nums[1] = 12;
        nums[2] = 23;
        nums[3] = 33;
        nums[4] = 167;
        double[] point = {10, 30, 156, 58};
        for (i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        for (j = 0; j < point.length; j++) {
            System.out.println(point[j]);
        }

    }
}
