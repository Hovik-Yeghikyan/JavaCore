package homework.chapter11;

public class JoinDemo {
    public static void main(String[] args) {
        NewTread3 ob1 = new NewTread3("ONE");
        NewTread3 ob2 = new NewTread3("TWO");
        NewTread3 ob3 = new NewTread3("THREE");

        System.out.println("Поток ONE запущен " + ob1.t.isAlive());
        System.out.println("Поток TWO запущен " + ob2.t.isAlive());
        System.out.println("Поток THREE запущен " + ob3.t.isAlive());

        try {
            System.out.println("Ожидание потоков");
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        }catch (InterruptedException e){
            System.out.println("Главный поток прерван");
        }
        System.out.println("Поток ONE завершен " + ob1.t.isAlive());
        System.out.println("Поток TWO завершен " + ob2.t.isAlive());
        System.out.println("Поток THREE завершен " + ob3.t.isAlive());
        System.out.println("Главный поток завершен");
    }
}
