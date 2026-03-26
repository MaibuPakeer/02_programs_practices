
package fundamentals;
import java.util.Scanner;

public class CountDigits8{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int number = sc.nextInt();

        int count = 0;

        int sum = 0;

        int temp = number; // store original number

        while (temp != 0) {

            int digit = temp % 10;   // get last digit

            sum = sum + digit;       // add to sum

            count++;                 // increase digit count

            temp = temp / 10;        // remove last digit

        }

        System.out.println("Total digits: " + count);

        System.out.println("Sum of digits: " + sum);

    }

}
 