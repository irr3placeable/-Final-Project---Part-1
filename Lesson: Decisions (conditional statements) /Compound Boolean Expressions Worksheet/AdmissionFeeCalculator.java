import java.util.Scanner;

public class AdmissionFeeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter age of the applicant: ");
        int age = scanner.nextInt();
        System.out.print("Enter experience code (N, E, M): ");
        String experience = scanner.next().toUpperCase();

        if (age < 16) {
            System.out.println("Applicant is ineligible for the program");
        } else {
            double fee = 0;
            if (16 <= age && age <= 25) {
                fee = experience.equals("N") ? 2.00 : experience.equals("E") ? 1.50 : 1.00;
            } else if (26 <= age && age <= 60) {
                fee = experience.equals("N") ? 1.50 : experience.equals("E") ? 1.00 : 0.75;
            } else if (age > 60) {
                fee = experience.equals("N") ? 0.90 : 0.75;
            }
            System.out.printf("The admission fee is $%.2f%n", fee);
        }

        scanner.close();
    }
}
