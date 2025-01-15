import java.util.Scanner;

public class PhrasePrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a phrase: ");
        String phrase = scanner.nextLine();
        System.out.print("Enter the number of times to print the phrase: ");
        int count = scanner.nextInt();

        printPhrase(phrase, count);
        scanner.close();
    }

    public static void printPhrase(String text, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(text);
        }
    }
}
