package homework.other;

public class Main extends Super {

    Main(){
        this(1);
        System.out.println("Main() constructor");
    }
    Main(int i){
        System.out.println("Main(int i) constructor");
    }

    public static void main(String[] args) {
        new Main();
    }

}

