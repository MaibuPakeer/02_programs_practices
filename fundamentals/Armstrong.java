package fundamentals;
import java.util.*;

public class Armstrong {

    public static void main(String[] args) {
        
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
      
        int n = sc.nextInt();
        
        int number = n;         
        int originalNumber = n;  
        int result = 0;         

        int exponent = String.valueOf(n).length(); 

        while (number != 0) {
            int base = number % 10;
            result += Math.pow(base, exponent); 
            number = number / 10;
        }
        if (result == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number");
        }

        sc.close();
    }
}
