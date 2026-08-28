import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("ax^2 + bx + c = 0 সমীকরণের মানগুলো দিন:");
        System.out.print("a এর মান: ");
        double a = input.nextDouble();

        System.out.print("b এর মান: ");
        double b = input.nextDouble();

        System.out.print("c এর মান: ");
        double c = input.nextDouble();

        // নিশ্চায়ক (Determinant) নির্ণয়
        double determinant = (b * b) - (4 * a * c);

        // শর্ত ১: মূল দুটি বাস্তব ও অসমান হলে
        if (determinant > 0) {
            double root1 = (-b + Math.sqrt(determinant)) / (2 * a);
            double root2 = (-b - Math.sqrt(determinant)) / (2 * a);
            System.out.printf("মূল দুটি হলো: %.2f এবং %.2f\n", root1, root2);
        }
        // শর্ত ২: মূল দুটি বাস্তব ও সমান হলে
        else if (determinant == 0) {
            double root = -b / (2 * a);
            System.out.printf("মূল দুটি সমান: %.2f\n", root);
        }
        // শর্ত ৩: মূল দুটি অবাস্তব (Complex/Imaginary) হলে
        else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-determinant) / (2 * a);
            System.out.printf("প্রথম মূল: %.2f + %.2fi\n", realPart, imaginaryPart);
            System.out.printf("দ্বিতীয় মূল: %.2f - %.2fi\n", realPart, imaginaryPart);
        }
        
        input.close();
    }
}
