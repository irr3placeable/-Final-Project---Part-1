import java.util.Scanner;

public class ComputerTroubleShooting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Computer Troubleshooting Program");
        System.out.println("Please answer the following questions with 'yes' or 'no'.");

        System.out.print("Does the computer beep on startup? ");
        String beepResponse = scanner.nextLine().toLowerCase();
        System.out.print("Does the hard drive spin? ");
        String spinResponse = scanner.nextLine().toLowerCase();

        if ("yes".equals(beepResponse)) {
            if ("yes".equals(spinResponse)) {
                System.out.println("Contact tech support.");
            } else {
                System.out.println("Check drive contacts.");
            }
        } else {
            if ("yes".equals(spinResponse)) {
                System.out.println("Check the speaker connections.");
            } else {
                System.out.println("Bring computer to repair center.");
            }
        }

        scanner.close();
    }
}
