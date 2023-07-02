import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int limit = sobj.nextInt();

        int no1 = 0, no2 = 1;

        System.out.println("Fibonacci Series: " + limit);
        System.out.print(no1 + " " + no2 + " ");

        for (int i = 2; i <= limit; i++) {
            int num = no1 + no2;
            System.out.print(num + " ");

            no1 = no2;
            no2 = num;
        }

        sobj.close();
    }
}
