import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // ৩টি সংখ্যা ইনপুট নেওয়া
        System.out.print("Prothom shonkha din: ");
        int n1 = input.nextInt();

        System.out.print("Ditio shonkha din: ");
        int n2 = input.nextInt();

        System.out.print("Tritio shonkha din: ");
        int n3 = input.nextInt();

        // লজিক চেক করা
        if (n1 >= n2 && n1 >= n3) {
            System.out.println(n1 + " hocche shobcheye boro shonkha.");
        } else if (n2 >= n1 && n2 >= n3) {
            System.out.println(n2 + " hocche shobcheye boro shonkha.");
        } else {
            System.out.println(n3 + " hocche shobcheye boro shonkha.");
        }

        input.close();
    }
}
