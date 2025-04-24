import java.util.*;
public class passing_array {
    public static void update(int marks[]){
        for(int i=0;i<=marks.length-1;i++) {
           marks[i] = marks[i] + 1;
        }
    }
    public static void main(String[] args) {
        int marks[] = {97,98,56,78,62};
        update(marks);

        for(int i=0;i<=marks.length-1;i++) {
            System.out.print(marks[i]+" ");
         }
        System.out.println();
    }
}
