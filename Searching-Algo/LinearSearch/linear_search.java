public class linear_search {
    public static void main(String[] args) {
        int []marks = {2,4,6,8,10,12,14,16};
        int key = 10;

        for(int i=0;i<marks.length;i++) {
                 if (marks[i] == key) 
        System.out.println("Key found at index " + i);
        }
    }
}
 