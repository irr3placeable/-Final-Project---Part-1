import java.util.Scanner;

public class RectanglePrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the horizontal dimension: ");
        int horizontal = scanner.nextInt();
        System.out.print("Enter the vertical dimension: ");
        int vertical = scanner.nextInt();

        for (int i = 0; i < vertical; i++) {
            for (int j = 0; j < horizontal; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}
