import java.util.Scanner;

public class ModifyMiddleElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = {1, 2, 3, 4, 5};

        System.out.print("Enter a number you would like to replace the middle number in the array with: ");
        int x = scanner.nextInt();

        numbers[2] = x;

        for (int number : numbers) {
            System.out.println(number);
        }
        scanner.close();
    }
}
