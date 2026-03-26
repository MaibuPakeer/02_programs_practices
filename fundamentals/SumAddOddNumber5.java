package fundamentals;

import java.util.Scanner;

public class SumAddOddNumber5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
  System.out.println("enter a number : ");
  Scanner sc =  new Scanner(System.in);
  int n = sc.nextInt();
   for(int i = 1; i <= n; i++) {
	   int odd = 2 * i-1;
	   sum +=odd;
   }
   System.out.println("to print n variable " + n + "sum of all odd numbers" + sum);
  
	}

}
