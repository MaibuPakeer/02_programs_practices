//14.	Java program to print all Armstrong numbers between 1 to n using for loop. 
package fundamentals;
import java.util.Scanner;
public class ArmstrongNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a number :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Armstrong numbers from 1 to " + n + ":");
		 for (int i = 1; i <= n; i++) {
			 
			 //i is checked whether it is an Armstrong number.
			 
	            int number = i;           //number used to extract exponent
	            int originalNumber = i;  //stores original value
	            int result = 0;         //result stores sum of powers.

	            int exponent = String.valueOf(i).length(); //Converts number to string and  length = number of digits.
                                                          // example : 153 = "153" ==>length = 3
	            while (number != 0) {
	                int base = number % 10;                                                  //(153!=0)-->true
	                result +=Math.pow(base, exponent);  // Math.pow(base, exponent)         // digit = 153 % 10 = 3
	                number =number/10;                                                     // number = 153 / 10 = 15
	            }

	            if (result == originalNumber) {
	                System.out.print(originalNumber + " ");
	            }
	        }

	        sc.close();
	    }
	}
	