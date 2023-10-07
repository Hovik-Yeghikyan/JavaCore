package homework.chapter8;

public class B extends A {
    int k;

    B(int a, int b, int c){
        super(a,b);
        k=c;
    }

    @Override
    void show() {
        super.show();
        System.out.println("k is " + k);
    }
}
