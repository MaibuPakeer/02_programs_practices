package fundamentals;

import java.util.Scanner;

public class SumOfEvenNumbers4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a numbers : ");
        int n = sc.nextInt();

        int sum = 0;
        System.out.println("Even Numbers :");
        for (int i = 1; i <= n; i++) {
        	
        if(i%2==0)
        {
        	System.out.println(i);
        }
        }
        
    }
}