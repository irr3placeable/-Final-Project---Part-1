import java.util.Scanner;

public class SubtractTwenty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the starting number: ");
        int number = scanner.nextInt();
        for (int i = 0; i < 3; i++) {
            number -= 20;
        }
        System.out.println("The result after subtracting 20 three times is: " + number);
        scanner.close();
    }
}
