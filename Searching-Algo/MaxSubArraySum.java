
import java.util.*;

class MaxSubArraySum {
    public static void MaxSubArrays(int num[]) {
        int currSum = 0;
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            int start = i;
            for (int j = i; j < num.length; j++) {
                int end = j;
                currSum = 0;
                for (int k = start; k <= end; k++) {
                    currSum += num[k];
                }
                System.out.println(currSum);
                if (maxsum < currSum) {
                    maxsum = currSum;
                }
            }
        }
        System.out.println("Maximum Sum " + maxsum);
    }

    public static void main(String[] args) {
        int num[] = { 1, -2, 6, -1, 3 };
        MaxSubArrays(num);
    }
}
