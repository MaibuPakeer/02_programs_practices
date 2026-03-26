// Java program to print all natural numbers from 1 to n using for loop. 
package fundamentals;

import java.util.Scanner;

public class NaturalNumber1 {

	public static void main(String[] args) {
		
		System.out.println("enter natural numbers");
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
				
   
for (int i=0;i<=n;i++) {

 System.out.println(i);
}
sc.close();
	}
}
