import java.util.ArrayList;
public class SwapTwoNumbers {
    public static void swap(ArrayList<Integer> list1, int idx1, int idx2) {
        int temp = list1.get(idx1);
        list1.set(idx1, list1.get(idx2));
        list1.set(idx2, temp);
    }


    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(5);
        list1.add(9);
        list1.add(3);
        list1.add(6);

        System.out.println(list1);
        int idx1 = 1, idx2 = 3;

        swap(list1, idx1, idx2);
        System.out.println(list1);

    }
}
