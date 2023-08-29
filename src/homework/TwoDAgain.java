package homework;

public class TwoDAgain {
    public static void main(String[] args) {
        int[][] twoD = new int[4][];
        twoD[0] = new int[7];
        twoD[1] = new int[4];
        twoD[2] = new int[11];
        twoD[3] = new int[3];
        int i, j, k = 0;
        for (i = 0; i < twoD.length; i++) {
            for (j = 0; j < twoD[i].length; j++) {
                twoD[i][j] = k;
                k++;
            }
        }
        for (i = 0; i < twoD.length; i++) {
            for (j = 0; j < twoD[i].length; j++) {
                System.out.print(twoD[i][j] + " ");
            }
            System.out.println();
        }
    }
}
