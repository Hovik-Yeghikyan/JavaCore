package homework.chapter10;

public class MultipleCatches {
    public static void main(String[] args) {
        try {
            int a = args.length;//164
            System.out.println("a = " + a);
            int b = 42 / a;
            int[] c = {1};
            c[42] = 99;
        } catch (ArithmeticException e) {
            System.out.println("Деление на нуль " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("За пределами массива " + e);
        }
        System.out.println("После блоков оператора try \\ catch");
    }
}
