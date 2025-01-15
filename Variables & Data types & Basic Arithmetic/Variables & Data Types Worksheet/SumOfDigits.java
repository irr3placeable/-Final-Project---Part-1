public class SumOfDigits {
    public static void main(String[] args) {
        int number = 565;
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        System.out.println("The sum of all digits is " + sum);
    }
}
