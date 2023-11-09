package homework.chapter13;
//import static java.lang.Math.sqrt;
public class AssertDemo {
    static int val = 3;

    static int getnum() {
        return val--;
    }
    public static void main(String[] args) {
        int n;
        for (int i = 0; i < 10; i++) {
            n = getnum();
        double d =    Math.sqrt(5.6);
            assert n > 0;
            System.out.println("n is: " + n + d);
        }
    }
}
