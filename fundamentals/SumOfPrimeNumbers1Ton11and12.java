//11.	Java program to print all Prime numbers between 1 to n using for loop. 
//12.	Java program to find sum of all prime numbers between 1 to n using for loop. 
package fundamentals;

import java.util.Scanner;

public class SumOfPrimeNumbers1Ton11and12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
	        System.out.println("Enter prime numbers 1 to n : ");
	        int n = sc.nextInt();
	        int sum = 0;
	        System.out.println("prime numbers are :");
	        for(int i = 1;i <= n;i++) {
	        	int count = 0;
	        	for(int j = 1;j <= i;j++) {
	        		
	        		if(i%j==0) {
	        			count=count+1;
	        		}
	        	}
	        	 if (count == 2) {
	   	    	  System.out.println(i+ " ");
	   	    	  sum = sum+i;
	        }
	      
	    	   
	       }
	        	System.out.println("\nsum of prime numbers are : " +sum);
	        }
	}


