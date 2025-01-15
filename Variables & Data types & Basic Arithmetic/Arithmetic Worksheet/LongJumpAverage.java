public class LongJumpAverage {
    public static void main(String[] args) {
        double[] jumps = {3.3, 4.0, 3.0};
        double sum = 0;
        for (double jump : jumps) {
            sum += jump;
        }
        double average = sum / jumps.length;
        System.out.println(average);
    }
}
