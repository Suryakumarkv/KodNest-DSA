package LinearSearch;

public class Largest_in_Array {
    public static int getLargest(int numbers[]) {
         int largest = Integer.MIN_VALUE;
         for(int i=0;i<numbers.length;i++) {
            if(numbers[i] > largest) {
                largest = numbers[i];
            }
         }
         return largest;
    }
        public static int getSmallest(int numbers[]) {
             int smallest = Integer.MAX_VALUE;
             for(int i=0;i<numbers.length;i++) {
                if(numbers[i] < smallest) {
                    smallest = numbers[i];
                }
             }
             return smallest;
        }
    
    public static void main(String[] args) {
        int []numbers = {1,2,6,3,5};
        System.out.println("Largest Element is " + getLargest(numbers));
        System.out.println("Smallest Element is " + getSmallest(numbers));

    }
}
