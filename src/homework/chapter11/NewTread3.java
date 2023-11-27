package homework.chapter11;

public class NewTread3 implements Runnable {
    Thread t;
    String name;

    NewTread3(String threadName) {
        name = threadName;
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
