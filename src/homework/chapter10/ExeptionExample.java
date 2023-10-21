package homework.chapter10;

public class ExeptionExample {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = a/0;
        }catch (ArithmeticException e){
            System.out.println("Нельзя делить на нуль");
        }
    }
}
