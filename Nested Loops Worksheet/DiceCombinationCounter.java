public class DiceCombinationCounter {
    public static void main(String[] args) {
        int[] targetSums = {3, 4, 12};
        int count = 0;

        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                int sum = i + j;
                for (int target : targetSums) {
                    if (sum == target) {
                        count++;
                    }
                }
            }
        }
        System.out.println("The number of ways to get a sum of 3, 4, or 12 with two 6-sided dice (order counts) is: " + count);
    }
}
