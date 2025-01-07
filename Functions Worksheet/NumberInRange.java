import java.util.Scanner;

public class NumberInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number to check: ");
        int number = scanner.nextInt();
        System.out.print("Enter the lower bound: ");
        int low = scanner.nextInt();
        System.out.print("Enter the upper bound: ");
        int high = scanner.nextInt();

        boolean isInRange = isInRange(number, low, high);
        if (isInRange) {
            System.out.println(number + " is within the range.");
        } else {
            System.out.println(number + " is not within the range.");
        }
        scanner.close();
    }

    public static boolean isInRange(int num, int start, int end) {
        return num >= start && num <= end;
    }
}
