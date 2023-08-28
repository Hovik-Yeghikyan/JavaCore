package homework1;

public class FigurePainter {
    public static void main(String[] args) {
        // 1st figure
        for (int i = 0; i < 6; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        // 2nd figure
        for (int x = 0; x < 6; x++) {
            for (int y = 5; y > x; y--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // 3rd figure
        for (int z = 0; z < 6; z++) {
            for (int a = 5; a > z; a--) {
                System.out.print("  ");
            }
            for (int b = 0; b < z; b++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        //4th figure
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < i; j++) {

                System.out.print("  ");
            }
            for (int k = 5; k > i; k--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // 5th figure
        for (int i = 0; i < 6; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 4; k > i; k--) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}