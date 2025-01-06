import java.util.Scanner;

public class NumberSorter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 100: ");
        int number = scanner.nextInt();

        if (number % 10 == 0) {
            System.out.println("Criteria A");
        } else if (number % 5 == 0 || number < 40) {
            System.out.println("Criteria B");
        } else if (number < 60) {
            System.out.println("Criteria C");
        } else {
            System.out.println("Does not match any Criteria");
        }

        scanner.close();
    }
}
