package homework.chapter11;

public class MultiThread implements Runnable {
    Thread t;
    String name;

    MultiThread(String threadname) {
        name = threadname;
        t = new Thread(this, name);
        System.out.println("New thread: " + t);
        t.start();
    }

    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(name + " " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(name + " " + "прерван");
        }
        System.out.println(name + " " + "завершен");
    }
}
