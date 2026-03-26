//10.	Java program to check whether a given number is Prime or not using for loop.


package fundamentals;

import java.util.Scanner;

public class PrimeNumbersUsingForloop {

	public static void main(String[] args) {
		System.out.println("enter a number : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if(n%i==0) {
				count = count+1;
			}
		}
		if(count == 2) {
			System.out.println("number is prime");
		}
		else {
			System.out.println("number is not a prime");

		}
	}
		}
	