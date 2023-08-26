package homework;

public class ArraySample {
    public static void main(String[] args) {
        int[] nums = {14, 67, 55, 87};
        double[] point = {2.5, 3.4, 6.7, 8.45};
        double result;
        for (int i = 0; i < 4; i++) {
            result = nums[i] * point[i];
            System.out.println(result);
        }
    }
}
