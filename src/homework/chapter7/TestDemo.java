package homework.chapter7;

public class TestDemo {
    public static void main(String[] args) {
        Test ob = new Test(12,22);
        Test ob2 = new Test(12,22);
        Test ob3 = new Test(3,7);

        System.out.println(ob.equalTo(ob2));
        System.out.println(ob.equalTo(ob3));

    }
}
