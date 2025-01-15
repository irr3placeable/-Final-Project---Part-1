public class WordPrinter {
    public static void main(String[] args) {
        String primaryWord = "Good";
        String secondaryWord = "Dog";
        for (int i = 0; i < 5; i++) {
            System.out.println(primaryWord);
            if (i < 4) {
                for (int j = 0; j < 3; j++) {
                    System.out.println(secondaryWord);
                }
            }
        }
    }
}
