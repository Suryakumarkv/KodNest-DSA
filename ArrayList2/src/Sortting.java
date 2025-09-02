import java.util.ArrayList;
import java.util.Collections;

public class Sortting {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(5);
        list1.add(9);
        list1.add(6);
        list1.add(7);
        Collections.sort(list1); //Ascending Order
        System.out.println(list1);

        Collections.sort(list1, Collections.reverseOrder());
        System.out.println(list1);
    }
}
