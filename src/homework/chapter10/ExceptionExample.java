package homework.chapter10;

public class ExceptionExample {
    public static void main(String[] args) {
//        try {
//            int a = 10;
//            int b = a/0;
//        }catch (ArithmeticException e){
//            System.out.println("Нельзя делить на нуль");
//        }


        String name = "Armen";
        String s = null;
        try {
            s = StringUtil.chekString(name);
            System.out.println(StringUtil.chekString(name));
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
