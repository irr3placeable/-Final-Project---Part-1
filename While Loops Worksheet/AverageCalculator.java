import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        double sum = 0;
        double number;

        System.out.println("Enter numbers (0 to finish):");

        while ((number = scanner.nextDouble()) != 0) {
            sum += number;
            count++;
        }

        if (count > 0) {
            double average = sum / count;
            System.out.println("The average is: " + average);
        } else {
            System.out.println("No numbers were entered.");
        }

        scanner.close();
    }
}
