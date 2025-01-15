import java.util.Scanner;

public class EmptyStringArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        String[][] array = createEmptyStringArray(rows, cols);
        printArray(array);

        scanner.close();
    }

    public static String[][] createEmptyStringArray(int rows, int cols) {
        String[][] arr = new String[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = "";
            }
        }
        return arr;
    }


    private static void printArray(String[][] array) {
        for (String[] row : array) {
            for (String element : row) {
                System.out.print("\"" + element + "\" ");
            }
            System.out.println();
        }
    }
}
