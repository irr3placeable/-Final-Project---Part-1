import java.util.Scanner;
import java.util.Random;

public class AdvancedGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numberToGuess = random.nextInt(50) + 1;
        int guessesAllowed;
        int guessCount = 0;
        boolean hasGuessedCorrectly = false;

        System.out.print("Choose a difficulty level (Easy = 9 guesses, Hard = 5 guesses): ");
        String difficulty = scanner.nextLine().toLowerCase();

        if ("hard".equals(difficulty)) {
            guessesAllowed = 5;
        } else {
            guessesAllowed = 9;
        }

        System.out.println("Guess a number between 1 and 50:");

        while (!hasGuessedCorrectly && guessCount < guessesAllowed) {
            int guess = scanner.nextInt();
            guessCount++;

            if (guess == numberToGuess) {
                System.out.println("You guessed correctly!");
                hasGuessedCorrectly = true;
            } else if (guess < numberToGuess) {
                System.out.println("Too low");
            } else {
                System.out.println("Too high");
            }

            if (!hasGuessedCorrectly && guessCount == guessesAllowed) {
                System.out.println("You've used all your guesses. The correct number was " + numberToGuess);
            }
        }

        scanner.close();
    }
}
