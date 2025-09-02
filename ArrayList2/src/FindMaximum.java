import java.util.*;
public class FindMaximum {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(5);
        list1.add(9);
        list1.add(3);
        list1.add(6);
        System.out.println(list1);

        int max = Integer.MIN_VALUE;

        for(int nums : list1){
            max=Math.max(nums,max);
        }

//        for(int i=0;i<list1.size();i++) {
//
//            max = Math.max(max, list1.get(i));  //Math function
////            if(max < list1.get(i)) {
////                max = list1.get(i);
////            }
//        }
        System.out.println("Max Element="  + max);
    }
}



