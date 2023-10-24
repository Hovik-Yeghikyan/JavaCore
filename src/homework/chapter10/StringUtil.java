package homework.chapter10;

public class StringUtil {

    public  static String chekString(String s) throws Exception {
        boolean result = true;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)){
                result = false;
                break;
            }
        }
        if (result){
            return s.toUpperCase();
        }
        throw new Exception("String contains digit");
    }
}
