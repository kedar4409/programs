import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int no = sobj.nextInt();

        if (no > 0) {
            System.out.println("The number is positive.");
        } else if (no < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        sobj.close();
    }
}
