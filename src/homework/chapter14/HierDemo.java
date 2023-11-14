package homework.chapter14;

public class HierDemo {

    public static void main(String[] args) {
        Gen1<String> w = new Gen1<>("Java", 2023);
        System.out.println(w.getOb() + " " + w.getNum());
    }
}
