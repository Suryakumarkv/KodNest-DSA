import java.util.Arrays;

public class diff {
    public static void main(String[] args) {
        int arr[] = {4, 2, -3, 1, 6};

        int x = 0;
        System.out.println(difff(arr,x));
    }

    private static boolean difff(int[] arr, int x) {
        int left = 0;
        int right = arr.length - 1;
        Arrays.sort(arr);
        while (left <= right) {
            if(arr[right] + arr[left] == x){
                return true;
            }
            left++;
            right--;
        }
        return false;
    }

}
