package homework.chapter12;

public class WrapperClassExample {
    public static void main(String[] args) {
        Integer a = Integer.valueOf(10);//new Integer(10);
        Integer aOb = 100;
        System.out.println(aOb);
        Character c = Character.valueOf('&');//new Character('&');
        System.out.println(a);
        System.out.println(c);
        System.out.println(Integer.MAX_VALUE);// ints max value
        System.out.println(Integer.max(10, 26));// find max value
        Boolean b = Boolean.valueOf("true");// trues object
        System.out.println(b);
        Integer i = 1000;//-127 -- 127 == , 127> equals
        Integer j = 1000;//автоупаковка
        int k = a;// автораспаковка
        System.out.println(i.equals(j));

        Integer z = 1000;
        System.out.println(z.byteValue());// autocast

    }
}
