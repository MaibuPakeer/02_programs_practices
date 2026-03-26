package fundamentals;

public class KLengthSubarraySum {
    public static void main(String[] args) {

        int[] arr = {3, 5, -2, 1};
        int k = 2;

        System.out.println("Subarray sums of length " + k + ":");

        for (int i = 0; i <= arr.length - k; i++) {
            int sum = 0;

            for (int j = i; j < i + k; j++) {
                sum += arr[j];
            }

            System.out.print(sum + " ");
        }
    }
}