import java.util.Scanner;

public class ReplaceArrayElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[15];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter a number: ");
            numbers[i] = scanner.nextInt();
        }

        System.out.print("Enter the position of the number you would like to replace: ");
        int replacePos = scanner.nextInt();

        System.out.print("Enter the value of the new number: ");
        int replaceNum = scanner.nextInt();

        numbers[replacePos] = replaceNum;

        for (int number : numbers) {
            System.out.println(number);
        }
        scanner.close();
    }
}
