package homework.chapter6.stack;

public class StackTest {
    public static void main(String[] args) {
        Stack myStack = new Stack();

        for (int i = 0; i < 10; i++) {
            myStack.push(i);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(myStack.pop());
        }

        Stack myStack2 = new Stack();
        for (int i = 10; i < 20; i++) {
            myStack2.push(i);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(myStack2.pop());
        }


    }
}
