public class MaximumAverageSubarray {


    public static double maxSubAvg(int nums[], int k) {
        int n = nums.length;
        long sum = 0;

        for(int i=0;i<k;i++) {
            sum += nums[i];
        }
       long maxSum = sum;

        for(int i=k;i<n;i++) {
            sum = sum - nums[i-k];
            sum = sum + nums[i];

            if(sum > maxSum) {
                maxSum = sum;
            }

        }
        return (double) maxSum / k;
    }

    public static void main(String[] args) {
        int nums[] = {1,12,-5,-6,50,3};
        int k = 4;
        System.out.println(maxSubAvg(nums, k));
    }
}
