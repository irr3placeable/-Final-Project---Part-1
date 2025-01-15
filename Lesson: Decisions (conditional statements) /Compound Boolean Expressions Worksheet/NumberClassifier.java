public class NumberClassifier {
    public static void main(String[] args) {
        int[] testNumbers = {15, 13, 21, 82};
        for (int number : testNumbers) {
            classifyNumber(number);
        }
    }

    private static void classifyNumber(int number) {
        if (isPrime(number) && number % 3 == 0) {
            System.out.println("Prime Triad");
        } else if (number % 10 == 5 || isPerfectSquare(number)) {
            System.out.println("Special Five or Square");
        } else if (isFibonacci(number) || isPalindrome(number)) {
            System.out.println("Fibonacci or Palindrome");
        } else {
            System.out.println("Unique Number");
        }
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean isPerfectSquare(int number) {
        int sqrt = (int) Math.sqrt(number);
        return sqrt * sqrt == number;
    }

    private static boolean isFibonacci(int number) {
        return isPerfectSquare(5 * number * number + 4) || isPerfectSquare(5 * number * number - 4);
    }

    private static boolean isPalindrome(int number) {
        int reversed = 0, original = number, remainder;
        while (number != 0) {
            remainder = number % 10;
            reversed = reversed * 10 + remainder;
            number /= 10;
        }
        return original == reversed;
    }
}
