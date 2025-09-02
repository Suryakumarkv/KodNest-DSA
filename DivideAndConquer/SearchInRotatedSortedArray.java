public class SearchInRotatedSortedArray {
    

    public static int search(int arr[], int target,int si,int ei) {
      
        if(si > ei) {
            return -1;
        }

        int mid = si + (ei-si)/2;
        if(arr[mid] == target) {
            return mid;
        }


        // mid on L1
        if(arr[si]<= arr[mid]) {
               if(arr[si] <= target && target <= arr[mid]) {
                //Left
                return search(arr, target, si, mid-1);
               } else {
                //right
                return search(arr, target, mid+1, ei);
               }
        } else {
            if(arr[mid] <= target && target<=arr[ei]) {
                //right
                return search(arr, target, mid+1, ei);
            } else {
                //left
                return search(arr, target, si, mid-1);
            }
        }
    }

    public static void main(String[] args) {
        int si = 0;
        
        int arr[] = {4,5,6,7,0,1,2};
        int ei = arr.length-1;
        int target = 0;
       System.out.println(search(arr, target, si, ei));
    }
}
