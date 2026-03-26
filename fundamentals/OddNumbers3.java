// Java program to print all odd numbers between 1 to 100 using for loop

package fundamentals;

public class OddNumbers3 {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {   
                System.out.print(i + " ");
            }
        }
    }
}