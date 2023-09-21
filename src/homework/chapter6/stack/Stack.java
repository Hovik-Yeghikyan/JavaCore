package homework.chapter6.stack;

public class Stack {
    int[] array = new int[10];
    int index;

Stack(){
    index = -1;
}
    void push(int item) {
        if (index> array.length-1||index==10) {
            System.out.println("Stack is full");
        }

         else{  array[++index] = item;
         }



    }

    int pop() {
        if (index < 0) {
            System.out.println("Stack is empty");
            return 0;
        }
            return array[index--];

    }
}
