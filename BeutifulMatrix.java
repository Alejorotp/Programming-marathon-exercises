import java.util.Scanner;

public class BeutifulMatrix {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int i, k, mov = 0;
        int[][] matrix = new int[5][5];
        for (i = 0; i < 5; i++) {
            for (k = 0; k < 5; k++) {
                matrix[i][k] = read.nextInt();
            }
        }
        while (matrix[2][2] == 0) {
            for (i = 0; i < 5; i++) {
                for (k = 0; k < 5; k++) {
                    if (matrix[i][k] == 1 & i < 2) {
                        matrix[i + 1][k] = matrix[i][k];
                        matrix[i][k] = 0;
                        mov++;
                    } else if (matrix[i][k] == 1 & i > 2) {
                        matrix[i - 1][k] = matrix[i][k];
                        matrix[i][k] = 0;
                        mov++;
                    }
                    if (matrix[i][k] == 1 & k < 2) {
                        matrix[i][k + 1] = matrix[i][k];
                        matrix[i][k] = 0;
                        mov++;
                    } else if (matrix[i][k] == 1 & k > 2) {
                        matrix[i][k - 1] = matrix[i][k];
                        matrix[i][k] = 0;
                        mov++;
                    }
                }
            }

        }
        System.out.println(mov);
    }

}
