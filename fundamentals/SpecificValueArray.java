package fundamentals;

import java.util.Scanner;

public class SpecificValueArray {

    public static void main(String[] args) {

        boolean s = false;
        int[] arr = {10, 20, 30, 30, 50};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value to search:");
        int value = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == value) {
                s = true;
                break;
            }

        }

        if (s) {
            System.out.println("Array contains the value: " + value);
        } else {
            System.out.println("Array does not contain the value: " + value);
        }
    }
}