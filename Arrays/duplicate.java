package Arrays;
public class duplicate {
    public static void main(String[] args) {
        int arr[] = {5,6,6,7,8,9,9};
        int j = 0;
        for(int i=0;i<=arr.length-1;i++) {
            if(arr[i] != arr[j]) {
 int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            j++;
            }
           
        }
         System.out.println(arr[j]);
    }
   
}
