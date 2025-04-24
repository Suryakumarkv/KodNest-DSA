import java.util.*;
public class largest_array {
    public static int largest(int number[]) {
      int largest = Integer.MIN_VALUE; // - infinity
      int smallest = Integer.MAX_VALUE;
      for(int i=0;i<=number.length-1;i++) {
        if(largest < number[i]) {
            largest =number[i];
        }
        if(smallest > number[i]) {
            smallest = number[i];
        }
      }
      System.out.println(smallest);
      return largest;
      
    }
    public static void main(String[] args) {
        int number[] = {1,2,6,3,5};
        System.out.println(largest(number));
    }
}
