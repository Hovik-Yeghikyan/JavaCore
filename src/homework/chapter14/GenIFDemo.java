package homework.chapter14;

public class GenIFDemo {
    public static void main(String[] args) {
        Integer[] nums = {12, 687, 44, 5, 1, 54};
        Character[] chs = {'b', 'g', 'r', 'q', 'p', 'a'};

        MyClass<Integer> iOb = new MyClass<>(nums);
        MyClass<Character> chOb = new MyClass<>(chs);

        System.out.println("inums max: " + iOb.max());
        System.out.println("inums min: " + iOb.min());
        System.out.println("chs max: " + chOb.max());
        System.out.println("chs min: " + chOb.min());
    }
}
