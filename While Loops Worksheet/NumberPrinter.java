import java.util.Scanner;

public class NumberPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three numbers (start, end, step): ");
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int step = scanner.nextInt();

        for (int i = start; i < end; i += step) {
            System.out.print(i + " ");
        }
        scanner.close();
    }
}
