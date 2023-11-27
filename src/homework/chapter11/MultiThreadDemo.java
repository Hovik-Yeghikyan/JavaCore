package homework.chapter11;

public class MultiThreadDemo {
    public static void main(String[] args) {
        new MultiThread("ONE");
        new MultiThread("TWO");
        new MultiThread("THREE");

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван");
        }
        System.out.println("Главный поток завершен");
    }
}
