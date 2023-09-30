package homework.chapter7;

public class VarArgs2 {
    static void vaTest(String msg, int... v) {
        System.out.print(msg + v.length + " Content: ");
        for (int x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest("Length of arguments: ", 10);
        vaTest("Length of arguments: ", 12, 14, 2, 3, 5);
        vaTest("Length of arguments: ");
    }
}
