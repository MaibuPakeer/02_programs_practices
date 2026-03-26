package fundamentals;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a prime number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

			if(n%2==0) {
				System.out.println("is a prime number");
			}
				else {
					System.out.println(" is even  number");
			
		}

	}

}

