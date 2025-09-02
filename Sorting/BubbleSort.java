package Sorting;

public class BubbleSort {

    public static void bubbleSort(int arr[]) {
        int swap = 0;
        for(int i=0;i<arr.length-1;i++) {
            
            for(int j=0; j<arr.length-1-i;j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap++;
                }
            }
           
        }
         System.out.println(swap);
    }
  public static void Array(int arr[]) {
    for(int i=0;i<arr.length;i++) {
        System.out.print(arr[i] + " ");
    }
    System.out.println();
  }
    public static void main(String[] args) {
        int arr[] = {1 ,2 ,3 ,4 ,5};
        bubbleSort(arr);
        Array(arr);
    }
}
