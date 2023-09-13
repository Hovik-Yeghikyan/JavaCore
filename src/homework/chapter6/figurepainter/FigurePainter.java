package homework.chapter6.figurepainter;

public class FigurePainter {
    void figureOne(int n, char c) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    void figureTwo(int n, char c) {
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    void figureThree(int n, char c) {
        for (int i = 1; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("  ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    void figureFour(int n, char c) {
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print("  ");
            }
            for (int j = n; j > i; j--) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    void figureFive(int n, char c) {
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = n; k > i; k--) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
