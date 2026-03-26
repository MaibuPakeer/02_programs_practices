package fundamentals;

import java.util.*;

public class DistributionChallenges {
    public static void main(String[] args) {

        int[] arr = {5, 10, 8, 12, 9, 15, 6};

        ArrayList<Integer> A = new ArrayList<>();
        List<Integer> B = new ArrayList<>();

        A.add(arr[0]);
        B.add(arr[1]);

        for (int i = 3; i < arr.length; i++) {

            int lastA = A.get(A.size() - 1);
            int lastB = B.get(B.size() - 1);

            if (lastA > lastB) {
                A.add(arr[i]);
            } else {
                B.add(arr[i]);
            }
        }

        int result = A.size() + B.size();

        System.out.println(result);
    }
}