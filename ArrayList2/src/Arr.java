import java.util.Arrays;
public class Arr {
    public static void main(String[] args) {
        int[] arr = {1,2,5,3,4,7};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int arr1[] = new int[5];
        Arrays.fill(arr1,1);
        System.out.println(Arrays.toString(arr1));

       int newA[] =  Arrays.copyOfRange(arr,0,5);
        System.out.println(Arrays.toString(newA));
    }
}
