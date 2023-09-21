package homework.chapter7;

public class OverLoad {
    void test() {
        System.out.println("No parameters");
    }

    //    void test(int a){
//        System.out.println("a is: " + a);
//    }
    void test(int a, int b) {
        System.out.println("a and b is: " + a + " " + b);
    }

    double test(double a) {
        System.out.println("double a is : " + a);
        return a * a;

    }
}
