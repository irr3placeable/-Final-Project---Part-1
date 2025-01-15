import java.util.Scanner;

public class PayRollWithTaxes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of hours worked in a week: ");
        int hours = scanner.nextInt();
        System.out.print("Enter the hourly rate of pay: ");
        double hourlyRate = scanner.nextDouble();
        System.out.print("Is the employee tax exempt? (yes/no): ");
        boolean isExempt = scanner.next().equalsIgnoreCase("yes");

        double totalPay = calculatePay(hours, hourlyRate);
        double finalPay = totalPay;

        if (!isExempt) {
            finalPay = totalPay * 0.82; // 18% tax deduction
        }

        System.out.println("The total pay is: $" + String.format("%.2f", finalPay));
        if (isExempt) {
            System.out.println("No Taxes Deducted");
        }

        scanner.close();
    }

    private static double calculatePay(int hours, double hourlyRate) {
        if (hours > 40) {
            int overtimeHours = hours - 40;
            return (40 * hourlyRate) + (overtimeHours * hourlyRate * 1.5);
        } else {
            return hours * hourlyRate;
        }
    }
}
