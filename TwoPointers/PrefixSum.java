import java.util.Arrays;

public class PrefixSum {

    public static void main(String[] args) {
        int arr[] = {2,4,6,8,1,2};
        int b[] = new int[arr.length];

        b[0] = arr[0];
        for(int i=1;i<arr.length;i++) {
           b[i] = b[i-1] + arr[i];
           
        }
        System.out.println(Arrays.toString(arr));
           System.out.println(Arrays.toString(b));
    }
}
