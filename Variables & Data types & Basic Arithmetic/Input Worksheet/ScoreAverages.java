import java.util.Scanner;

public class ScoreAverages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first score: ");
        double score1 = scanner.nextDouble();
        System.out.print("Enter the second score: ");
        double score2 = scanner.nextDouble();
        System.out.print("Enter the third score: ");
        double score3 = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter the name of the player: ");
        String name = scanner.nextLine();
        double average = (score1 + score2 + score3) / 3;
        System.out.printf("%s scored an average of %.1f per game.\n", name, average);
        scanner.close();
    }
}
