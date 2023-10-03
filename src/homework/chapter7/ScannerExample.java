package homework.chapter7;

import homework1.ArrayUtil;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input numbers divided by ,");
        String numbersStr = scanner.nextLine();
        String[] numbersStrArray = numbersStr.split(",");
        int [] numbers = new int[numbersStrArray.length];
        int index = 0;
        for (String numberStr : numbersStrArray) {
            numbers[index++] = Integer.parseInt(numberStr);
        }
        int max = ArrayUtil.max(numbers);
        System.out.println("Max " + max);
//        System.out.println("Please input a");
//        int a = Integer.parseInt(scanner.nextLine());
//        System.out.println("Please input b");
//        int b = Integer.parseInt(scanner.nextLine());
//        System.out.println("Please input + or -");
//        String op = scanner.nextLine();
//        if (op.equals("+")) {
//            System.out.println(a + b);
//        } else if (op.equals("-")) {
//            System.out.println(a - b);
//        } else {
//            System.out.println("unsupported operation");
//        }
//    }
}
}
