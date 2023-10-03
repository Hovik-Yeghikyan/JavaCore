package homework.chapter7;

public class ExampleArraycopy {
    public static void main(String[] args) {
        int[] array = new int [10];
        int [] oldArray = {6,4,5,6,7};
        System.arraycopy(oldArray,0,array,0, oldArray.length);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}