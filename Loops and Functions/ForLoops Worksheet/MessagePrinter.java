import java.util.Scanner;

public class MessagePrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of times you want to print the message: ");
        int count = scanner.nextInt();
        String message = "Hello, World!";
        for (int i = 0; i < count; i++) {
            System.out.println(message);
        }
        scanner.close();
    }
}
