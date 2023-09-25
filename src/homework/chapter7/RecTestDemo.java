package homework.chapter7;

public class RecTestDemo {
    public static void main(String[] args) {
        RecTest ob = new RecTest(7);
        int i;
        for ( i = 0; i <5 ; i++) {
            ob.values[i] = i;
        }
        ob.printArray(7);
    }
}
