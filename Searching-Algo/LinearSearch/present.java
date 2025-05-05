package LinearSearch;

public class present {
    
    public static boolean exist(int numbers[]) {

      boolean present = false;
       int target = 5;
      for(int i=0;i<numbers.length;i++) {
        if(numbers[i] == target) {
            present = true;
            break;
        } 
      }
         return present;
    }

    public static void main(String args[]) {
        int numbers[] =  {1,2,3,4,5,6};
        System.out.println("Element exist : " + exist(numbers));
    }
}
