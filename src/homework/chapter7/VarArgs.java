package homework.chapter7;

public class VarArgs {
    static void vaTest(int ... v) {
        System.out.print("Length of arguments " + v.length + " Contents of arguments: ");
        for (int x : v) {
            System.out.print(x + " ");

        }
        System.out.println();
    }

    public static void main(String[] args) {
         vaTest(10);
         vaTest(1,7,5,6,8,11);
         vaTest();
    }
}
