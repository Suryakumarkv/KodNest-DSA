public class pmes {

    public static void MergeSort(int arr[], int si, int ei) {
        if(si>ei) {
            return;
        }
        int mid = si + (ei-si)/2;
        MergeSort(arr, si, mid);
        MergeSort(arr, mid+1, ei);
    }

    public static void Merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei-si+1];
        int i = si;
        int j = mid+1;
        int k = 0;
   
        while(i <= mid && j<= ei) {
            if(arr[i]<arr[j]) {
                 temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
            k++;
        }
        while(i <= mid) {
            temp[k++] = arr[i++]; 
        }

        while(j <= mid) {
            temp[k++] = arr[j++];
        }
        for(k=0, i=si; k <temp.length;i++, k++) {
             arr[i]= temp[k];
        }
    }

    public static void printArray(int arr[]) {
        for(int i=0;i<arr.length;i++) {
           System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
public static void main(String[] args) {
   int arr[] = {9,5,9,8,2,6,3};
   int si = 0;
   int ei = arr.length-1;
   Merge(arr, si, ei, ei);
   printArray(arr);
}   
}