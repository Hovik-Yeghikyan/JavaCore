package homework.chapter7;

public class MyString {
    public static void main(String[] args) {
        String name = new String("Java");
        String name1 = "JavaCore";
        String name2 = "Hello";
        String name3 = "Java";
        System.out.println(name.charAt(2));
        System.out.println(name2.substring(2));
        System.out.println(name1.substring(1, 5));
        System.out.println(name1.equals(name));
        System.out.println(name.equals(name3));
        System.out.println(name1.length());
        StringBuilder name4 = new StringBuilder("world");
        for (int i = 0; i < 10; i++) {
            name4.append(i);
        }
        System.out.println(name4);

    }
}
