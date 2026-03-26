// Java program to print multiplication of any number using for loop

package fundamentals;

import java.util.Scanner;

public class Multiplication6 {

	public static void main(String[] args) {

		System.out.println("enter multiplication of any  numbers");
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		System.out.println("multiplication table :");
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + "*" + i + "=" + (n * i));
		}
	
	}
}
