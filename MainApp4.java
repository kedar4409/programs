import java.util.Scanner;

public class LargestNumberFinder {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = sobj.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sobj.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = sobj.nextInt();

        int largestNumber;

        if (num1 >= num2) {
            if (num1 >= num3) {
                largestNumber = num1;
            } else {
                largestNumber = num3;
            }
        } else {
            if (num2 >= num3) {
                largestNumber = num2;
            } else {
                largestNumber = num3;
            }
        }

        System.out.println("The largest number is: " + largestNumber);

        sobj.close();
    }
}
