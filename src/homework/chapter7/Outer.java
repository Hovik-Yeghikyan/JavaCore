package homework.chapter7;

public class Outer {
    int outerX = 64;

    class Inner {
        int y = 7;

        void display() {

            System.out.println("outerX = " + outerX);
        }
    }

    void test() {
        Inner in = new Inner();
        in.display();
    }

    void showY() {
        Inner prntY = new Inner();
        System.out.println("y = " + prntY.y);
    }
}
