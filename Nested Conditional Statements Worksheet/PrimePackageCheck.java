import java.util.Scanner;

public class PrimePackageCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Are you a Prime user? ('yes' or 'no'): ");
        boolean isPrime = scanner.nextLine().trim().equalsIgnoreCase("yes");
        System.out.print("Enter the number of copies (if applicable): ");
        int copies = scanner.nextInt();

        System.out.print("Enter the weight of the package (kg): ");
        double weight = scanner.nextDouble();
        System.out.print("Enter the dimensions of the package (length, width, height in cm): ");
        double length = scanner.nextDouble();
        double width = scanner.nextDouble();
        double height = scanner.nextDouble();

        double volume = length * width * height / 1000000; // Convert cubic cm to cubic meters

        if (weight > 27) {
            if (volume > 0.1) {
                System.out.println("Too heavy and too large.");
            } else {
                System.out.println("Too heavy.");
            }
        } else if (volume > 0.1) {
            System.out.println("Too large.");
        } else {
            System.out.println("Package meets requirements.");
            if (isPrime && copies >= 900) {
                System.out.println("You are eligible for a 10% discount.");
            }
        }

        scanner.close();
    }
}
