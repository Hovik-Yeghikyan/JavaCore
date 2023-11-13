package homework.chapter14;

public class GenDemo {

    public static void main(String[] args) {
        Gen<Integer> iOb;
        iOb = new Gen<Integer>(80);
        iOb.showType();
        int v = iOb.getOb();
        System.out.println("v is: " + v);
        System.out.println();

        Gen<String> strOb = new Gen<>("this is a text");
        strOb.showType();
        String str = strOb.getOb();
        System.out.println("str is: " + str);
    }
}
