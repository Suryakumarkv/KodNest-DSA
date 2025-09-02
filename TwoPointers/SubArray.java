public class SubArray {
    public static void main(String[] args) {
        int nums[] = {5,3,4,7,9,1};
        for(int i=0;i<nums.length;i++) {
            int start = i;
            for(int j=i;j<nums.length;j++) {
                int end = j;
                for(int k=start;k<=end;k++) {
                   System.out.print(nums[k] + " ,");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
