import java.util.Scanner;

public class MiniCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();
        int sum = num1 + num2;
        int difference = num2 - num1;
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum + ".");
        System.out.println("The difference between " + num2 + " and " + num1 + " is " + difference + ".");
        scanner.close();
    }
}
