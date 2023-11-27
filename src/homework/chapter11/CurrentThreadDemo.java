package homework.chapter11;

public class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("Current execution flow " + t);
        System.out.println(t.getName());
        t.setName("MyThread");
        System.out.println("After changing the stream name: " + t);
        System.out.println(t.getName());
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("The main execution thread is interrupted");
        }
    }
}
