package homework.chapter14;

public class Gen1<T> extends NonGen {
    T ob;

    Gen1(T o, int i) {
        super(i);
        ob = o;
    }

    T getOb(){
        return ob;
    }
}
