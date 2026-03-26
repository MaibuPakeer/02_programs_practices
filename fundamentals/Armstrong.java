//package fundamentals;
//import java.util.*;
//public class Armstrong {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		System.out.println("Enter a number : ");
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		for(int i = 1; i <= n; i++) {
//			int num = i;
//			int sum = 0;
//			while (num > 0) {
//				int amr = num % 10;
//				sum = sum + amr * amr * amr ;
//				num = num/10;
//				
//			}
//			if (sum == i) {
//				System.out.println(i);
//			}
//		}
//
//	}
//
//}


package fundamentals;
import java.util.*;

public class Armstrong {

    public static void main(String[] args) {
    	
    	System.out.println("Enter a number:");

        Scanner sc = new Scanner(System.in);
      
        int num = sc.nextInt();

        int original = num;
        int sum = 0;

        for (; num > 0; num = num / 10) {
            int digit = num % 10;
            sum = sum + digit * digit * digit;
        }

        if (sum == original) {
            System.out.println(original + " is an Armstrong number");
        } else {
            System.out.println(original + " is not an Armstrong number");
        }

        sc.close();
    }
}
