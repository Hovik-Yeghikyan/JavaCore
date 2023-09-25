package homework.chapter7;

public class StaticByName {
    public static void main(String[] args) {
        StaticDemo ob = new StaticDemo();
        StaticDemo.callme();
        System.out.println("b = " + StaticDemo.b);
    }
}
