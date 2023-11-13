package homework.chapter14;

public class GenMethDemo {

    static <T extends Comparable<T>, V extends T>
    boolean isIN(T x, V[] y) {
        for (int i = 0; i < y.length; i++) {
            if (x.equals(y[i])) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Integer[] nums = {1, 2, 3, 4, 5};
        if (isIN(2, nums)) {
            System.out.println("nums contains 2");
        }
        if (!isIN(7, nums)) {
            System.out.println("nums is not contains 7");
        }


        String[] strs = {"one", "two", "three", "four", "five"};
        if (isIN("two", strs)) {
            System.out.println("strs contains 'two'");
        }
        if (!isIN("seven", strs)) {
            System.out.println("strs is not contains 'seven'");
        }
    }
}
