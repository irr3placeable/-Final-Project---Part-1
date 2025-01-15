import java.util.Scanner;

public class PayRoll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of hours worked in a week: ");
        int hours = scanner.nextInt();
        System.out.print("Enter the hourly rate of pay: ");
        double hourlyRate = scanner.nextDouble();

        double totalPay = calculatePay(hours, hourlyRate);

        System.out.println("The total pay is: $" + String.format("%.2f", totalPay));
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
