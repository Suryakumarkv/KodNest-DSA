import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int sum = 0;
        // imperative approach
        for(int i=0;i<arr.length;i++){
            if(arr[i] % 2 == 0) {
                sum += arr[i];
            }
        }

        //Using Stream
        int arr1[] = {1,2,3,4,5};
        int sum2 = Arrays.stream(arr1).filter(n -> n % 2 == 0).sum();
        System.out.println(sum2);
    }
}
