import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base (vumi) of the triangle: ");
        double base = scanner.nextDouble();

        System.out.print("Enter the height (ucchota) of the triangle: ");
        double height = scanner.nextDouble();

        double area = 0.5 * base * height;

        System.out.println("Trivujer khetrofol (Area): " + area);

        scanner.close();
    }
}
