import java.util.Scanner;

public class AreaVolume {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 'A' to calculate the area of a rectangle or 'V' to calculate the volume of a rectangular prism: ");
        String choice = scanner.nextLine().trim().toUpperCase();

        if ("A".equals(choice)) {
            System.out.print("Enter the length of the rectangle: ");
            double length = scanner.nextDouble();
            System.out.print("Enter the width of the rectangle: ");
            double width = scanner.nextDouble();
            double area = length * width;
            System.out.println("The area of the rectangle is: " + round(area, 2));
        } else if ("V".equals(choice)) {
            System.out.print("Enter the length of the rectangular prism: ");
            double length = scanner.nextDouble();
            System.out.print("Enter the width of the rectangular prism: ");
            double width = scanner.nextDouble();
            System.out.print("Enter the height of the rectangular prism: ");
            double height = scanner.nextDouble();
            double volume = length * width * height;
            System.out.println("The volume of the rectangular prism is: " + round(volume, 2));
        } else {
            System.out.println("Invalid input. Please enter 'A' or 'V'.");
        }

        scanner.close();
    }

    private static double round(double value, int places) {
        double scale = Math.pow(10, places);
        return Math.round(value * scale) / scale;
    }
}
