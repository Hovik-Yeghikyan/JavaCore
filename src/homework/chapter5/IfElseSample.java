package homework.chapter5;

public class IfElseSample {
    public static void main(String[] args) {
        int i = 6;
        if (i == 12 || i == 1 || i == 2) {
            System.out.println("winter");
        } else if (i == 3 || i == 4 || i == 5) {
            System.out.println("spring");
        } else if (i == 6 || i == 7 || i == 8) {
            System.out.println("summer");
        } else if (i == 9 || i == 10 || i == 11) {
            System.out.println("autumn");
        } else {
            System.out.println("season is not supported");
        }
    }
}
