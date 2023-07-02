import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter count of numbers: ");
        int count = sobj.nextInt();

        int sum = 0;
        int no;
        int i = 0;

        System.out.println("Enter numbers:");

        do {
            no = sobj.nextInt();
            sum += no;
            i++;
        } while (i < count);

        double avg = (double) sum / count;
        System.out.println("Average: " + avg);

        sobj.close();
    }
}
