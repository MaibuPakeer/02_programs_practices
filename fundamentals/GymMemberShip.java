package fundamentals;

import java.util.Scanner;

public class GymMemberShip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the months :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n == 1) {
			System.out.println(2000);
		}
		else if (n == 3) {
			System.out.println(5000);
			
		}
		else if (n == 6) {
			System.out.println(9000);
			
		}
		else if (n == 9) {
			System.out.println(12000);
			
		}
		else if (n == 12) {
			System.out.println(15000);
			
		}
		else if (n == 0) {
			System.out.println(0);
			
		}else {
			System.out.println("error");
		}
		sc.close();

	}

}
