import java.util.*;
public class Iteratorrr {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        Iterator<Integer> it = list.iterator();


        while (it.hasNext()) {
            Integer num = it.next();   // call next() only once
            System.out.println(num);

            if (num.equals(9)) {
                it.remove();
            }
        }
        System.out.println(list);
    }
}
