import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter four numbers to multiply:");
        double product = 1.0; // Start with 1 because multiplying by 1 does not change the value
        for (int i = 0; i < 4; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            product *= scanner.nextDouble(); // Multiplying numbers sequentially
        }
        System.out.println("The product of the entered numbers is: " + product);
        scanner.close();
    }
}
