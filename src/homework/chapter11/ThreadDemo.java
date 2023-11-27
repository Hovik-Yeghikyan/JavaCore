package homework.chapter11;

public class ThreadDemo {
    public static void main(String[] args) {
        new NewThread();
//        NewThread newThread = new NewThread();
//        Thread myThread = new Thread(newThread);
//        myThread.start();

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Главный поток " + i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println("Главный поток прерван");
        }
        System.out.println("Главный поток завершен");
    }
}
