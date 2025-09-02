
public class Floor {

    public static int binary(int arr[], int target) {
        int low= 0;
        int high = arr.length-1;
        int ans = -1;

        while(low <= high) {
            int mid = (low + high )/2;
            if(target == arr[mid]) {
                return mid;
            } else if(arr[mid] < target) {
                low = mid+1;
                ans = arr[mid];
                
            } else {
                
                high = mid - 1; 
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,5,9,14,16,18};
        int target = 15;
        System.out.println(binary(arr, target));

    }
}
