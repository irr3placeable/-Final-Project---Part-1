import java.util.Scanner;

public class AntiDiagonalsInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the square matrix: ");
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];

        System.out.println("Enter the matrix elements row by row:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int[][] antiDiagonals = getAntiDiagonals(matrix);
        System.out.println("Anti-diagonals of the matrix:");
        for (int[] row : antiDiagonals) {
            System.out.print("[");
            for (int i = 0; i < row.length; i++) {
                System.out.print(row[i] + (i < row.length - 1 ? ", " : ""));
            }
            System.out.println("]");
        }
        scanner.close();
    }

    public static int[][] getAntiDiagonals(int[][] matrix) {
        int n = matrix.length;
        int[][] result = new int[2 * n - 1][];

        for (int k = 0; k < result.length; k++) {
            int start_col = Math.max(0, k - n + 1);
            int count = Math.min(k + 1, n - start_col);
            result[k] = new int[count];
            for (int j = 0; j < count; j++) {
                result[k][j] = matrix[k - start_col - j][start_col + j];
            }
        }
        return result;
    }
}
