package homework.chapter6.arrayutil;

public class ArrayUtil {
    int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};
    int j = 0, x = 0, y = 0, z = 0;
    int min = numbers[0];
    double result;
    int k = numbers.length;

    void firstElrment() {
        System.out.println("the first element is " + numbers[0]);
    }

    void lastElement() {
        System.out.println("the last element is " + numbers[numbers.length - 1]);
    }

    void lenghth() {
        System.out.println("the numbers[] length is " + numbers.length);
    }

    void minimum() {
        for (int i = 1; i < numbers.length; i++) {
            if (min >= numbers[i]) {
                min = numbers[i];
            }
        }
        System.out.println("the smallest number is " + min);
    }

    void middle() {
        if (numbers.length <= 2) {
            System.out.println("can't print middle values");
        } else if (numbers.length % 2 == 0) {
            while (++j < --k) ;
            System.out.println("the middle numbers is " + numbers[j] + " and " + numbers[j - 1]);
        } else if (numbers.length % 2 != 0) {
            while (++j < --k) ;
            System.out.println("the middle number is " + numbers[k]);
        }
    }

    void evenOdd() {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                x++;
            } else if (numbers[i] % 2 != 0) {
                y++;
            }
        }
        System.out.println("count of even numbers is " + x);
        System.out.println("count of odd numbers is " + y);

    }

    void totalAndEverege() {
        for (int i = 0; i < numbers.length; i++) {
            z = z + numbers[i];
        }
        System.out.println("total sum is " + z);
        result = z / numbers.length;
        System.out.println("average is " + result);
    }
}
