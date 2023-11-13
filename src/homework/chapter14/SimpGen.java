package homework.chapter14;

public class SimpGen {
    public static void main(String[] args) {
        TwoGen<Integer, String> tgObj = new TwoGen<>(88, "TwodGen text");
        tgObj.showTypes();
        int i = tgObj.getOb1();
        String str = tgObj.getOb2();

        System.out.println("v is: " + i + "\n" + "str is: " + str);
    }
}
