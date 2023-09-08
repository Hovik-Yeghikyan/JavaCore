package homework.chapter5;

public class ForEachSample {
    public static void main(String[] args) {
        int[] nums = {1, 4, 6, 15, 77, 45, 66};
        int sum = 0;
        for (int x : nums) {
            sum += x;
            System.out.print(x + " ");
            if(x==15){
                break;
            }
        }
        System.out.println();
        System.out.println("sum is: " + sum);
    }
}
