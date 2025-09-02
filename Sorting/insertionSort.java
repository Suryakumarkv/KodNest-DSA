package Sorting;
import java.util.Arrays;
public class insertionSort {
    public static void main(String[] args) {
        int arr[] = {5, 6 , 2, 3, 1, 8, 4};

        for(int i=1;i<arr.length;i++) {
            int key = arr[i];
            int j = i-1;

            while(j >= 0 && arr[j] > key) {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1] = key;
        }

        for(int i=0;i<arr.length;i++) {
            //   Arrays.sort(arr, 0, arr.length);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
