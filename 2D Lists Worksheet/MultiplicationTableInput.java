import java.util.Scanner;

public class MultiplicationTableInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the multiplication table: ");
        int size = scanner.nextInt();

        int[][] table = multiplicationTable(size);
        System.out.println("Multiplication table:");
        for (int[] row : table) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        scanner.close();
    }

    public static int[][] multiplicationTable(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }
        return table;
    }
}
