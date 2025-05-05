package Binarysearch;

public class ReverseAnArray {
    public static void reverse(int numbers[]) {
        int reverse;
        for(int i=numbers.length-1;i>=0;i--) {
            
              System.out.println(numbers[i]);
        }
    }

    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        reverse(numbers);
    }
}
