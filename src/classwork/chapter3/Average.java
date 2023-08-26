package classwork.chapter3;

public class Average {
    public static void main(String[] args) {
        double nums[] = {10.5, 14.3, 65.7, 98.2};
        double result = 0;
        for (int i = 0; i < 4; i++) {
            result = result + nums[i];
        }

        System.out.println(result / 5);
    }
}