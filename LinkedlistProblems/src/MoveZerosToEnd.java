import java.util.Arrays;

public class MoveZerosToEnd {

    public static void main(String[] args) {
        int arr[] = {1,0,1,0,0,1,0,1};
        move(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void move(int arr[]) {
        int j=0;

        for(int i=0;i<arr.length;i++) {
            if(arr[i] != 0) {
                arr[j] = arr[i];
                j++;
            }
        }
        while(j<arr.length) {
            arr[j] = 0;
            j++;
        }
    }
}
