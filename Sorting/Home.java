package Sorting;

public class Home {
    
 public static void bubbleSort(int arr[]) {
    for(int i=0;i<arr.length-1;i++) {
        for(int j=0;j<arr.length-1-i;j++) {
            if(arr[j] < arr[j+1]) {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
 }


 public static void SelectionSort(int arr[]) {
    
    for(int i=0;i<arr.length;i++) {
        int minpos = i;
        for(int j=i+1;j<arr.length;j++) {
            if(arr[minpos] < arr[j]) {
                minpos = j;
            }
        }
            int temp = arr[i];
            arr[i] = arr[minpos];
           arr[minpos] = temp;
    }
 }

 public static void insertionSort(int arr[])  {
    for(int i=1;i<arr.length;i++) {
        int key = arr[i];
        int j = i-1;
        while(j>=0 && arr[j] < key) {
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = key;
    }
 }


 public static void Print(int arr[]) {
    for(int i=0;i<arr.length;i++) {
        System.out.print(arr[i] + " ");
    }
    System.out.println();
 }

    public static void main(String[] args) {
        int arr[] = {3,6,1,2,5,2,8,9};
        bubbleSort(arr);
        Print(arr);
        SelectionSort(arr);
        Print(arr);
        insertionSort(arr);
        Print(arr);
    }
}
