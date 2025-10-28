import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayClass {
    public static void main(String[] args) {
//        int arr[] = {1,25,3,4,50,6,7,8,90};
////        int index = Arrays.binarySearch(arr,5);
////        System.out.println(index);
//
//        Integer arr1[] = {1,25,3,4,50,6,7,8,90};
//         Arrays.sort(arr1);
//
//         System.out.println(Arrays.toString(arr1));


        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(25);
        a.add(3);
        a.add(44);
        a.add(35);

        Collections.sort(a);
        System.out.println(a);

    }
}
