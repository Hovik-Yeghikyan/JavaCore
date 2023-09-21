package homework.chapter7;

public class OverLoadDemo {
    public static void main(String[] args) {
        OverLoad ob = new OverLoad();
        ob.test();
        ob.test(7);
        ob.test(8, 9);
        double result = ob.test(12.5);
        System.out.println("return result is: " + result);
    }
}
