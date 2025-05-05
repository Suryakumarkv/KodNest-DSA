package LinearSearch;

public class FirstElementGreater {
    
    public static void greater(int numbers[]) {
        int x = 5;
        for(int i=0;i<numbers.length;i++) {
            if(numbers[i] > x) {
                System.out.println("Index of first element greater than " + x + " is found at: " + i + " and the value is: " + numbers[i]);
                return;
            }
        }
        
        System.out.println("No element is greater than " + x);
    }

    public static void main(String[] args) {
        int numbers[] = {3,8,2,9};
        greater(numbers);
    }
}
