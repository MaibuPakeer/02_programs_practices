// Java program to print all even numbers between 1 to 100 using for loop. 

package fundamentals;

import java.util.Scanner;

public class EvenNumber2 {

	public static void main(String[] args) {
		
		System.out.println("enter even numbers from 1 to 100");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
				for(int i=1;i<=100;i++) {
					if (i%2==0) {
					System.out.println(i);
				}
    
	}

}
}