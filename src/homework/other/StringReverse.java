package homework.other;

public class StringReverse {

    public static String reversedWord(String word) {
        char[] chars = word.toCharArray();
        String result = "";
        for (int i = chars.length - 1; i >= 0; i--) {
            result = result + chars[i];
        }
        return result;
    }

    public static void main(String[] args) {
        String word = "Hello world";
        System.out.println(StringReverse.reversedWord(word));
    }
}
