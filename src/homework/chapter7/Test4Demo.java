package homework.chapter7;

public class Test4Demo {
    public static void main(String[] args) {
        Test4 ob = new Test4(2);
        Test4 ob2;
        ob2 = ob.incrByTen();
        System.out.println(ob.a);
        System.out.println(ob2.a);
        ob2 = ob2.incrByTen();
        System.out.println(ob2.a);
        ob2 = ob2.incrByTen();
        System.out.println(ob2.a);
        System.out.println(ob.a);
    }
}
