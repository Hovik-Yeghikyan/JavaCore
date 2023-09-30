package homework.chapter7;

public class VarArgsOverload {
    static void vaTest(int... v) {
        System.out.print("vaTest(int ...): " + "length of arguments: " + v.length + " content: ");
        for (int x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    static void vaTest(boolean... v) {
        System.out.print("vaTest(boolean ...): " + "length of arguments: " + v.length + " content: ");
        for (boolean x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    static void vaTest(String msg, int... v) {
        System.out.print(msg + v.length + " Content: ");
        for (int x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(1, 3, 7, 5);
        vaTest("Length: ", 45, 67, 185, 66);
        vaTest(true, false, false, true);

    }
}
