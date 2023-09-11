package homework.chapter4;

public class ChristmasTree2 {
    public static void main(String[] args) {

        for (int i = 0; i < 6; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                if (i == 1)
                    System.out.print("~*~");
                else System.out.print(" *");
            }

            System.out.println();
        }
    }
}
