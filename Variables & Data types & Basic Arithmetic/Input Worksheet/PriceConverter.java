import java.util.Scanner;

public class PriceConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the price of the item: ");
        double price = scanner.nextDouble();
        System.out.printf("The price you entered is: $%.2f\n", price);
        scanner.close();
    }
}
