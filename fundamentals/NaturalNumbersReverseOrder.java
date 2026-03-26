//Java program to print all natural numbers in reverse order using for loop. 
package fundamentals;

import java.util.Scanner;

public class NaturalNumbersReverseOrder {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the natural number Revers order :");

        int n = sc.nextInt();

        for (int i = n; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }
}