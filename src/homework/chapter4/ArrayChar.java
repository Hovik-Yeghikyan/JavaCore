package homework.chapter4;

public class ArrayChar {
    public static void main(String[] args) {
        char[] ch = {'X','Y','Z'};
        System.out.println(ch[0]);
        System.out.println(ch[1]);
        System.out.println(ch[2]);
        for (int i = 0; i < 3; i++) {
            System.out.println(ch[i] + 0);
        }
    }
}
