package homework.chapter7;

public class Test3Demo {
    public static void main(String[] args) {
        Test3 obj = new Test3(16,40);
        System.out.println(obj.a + " " + obj.b);
        obj.meth(obj);
        System.out.println(obj.a);
        System.out.println(obj.b);

    }
}

