import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparatorrr  {
    public static void main(String[] args) {
        List<studentSet> a = new ArrayList<>();
        a.add(new studentSet(1, "surya"));
        a.add(new studentSet(2, "ak"));
        a.add(new studentSet(4, "kumar"));
        a.add(new studentSet(3, "hk"));



        //Based on name
//        Collections.sort(a, new Comparator<studentSet>() {
//            @Override
//            public int compare(studentSet o1, studentSet o2) {
//                return o1.name.compareTo(o2.name);
//            }
//        });
//        System.out.println(a);


//        Collections.sort(a, new Comparator<studentSet>() {
//            @Override
//            public int compare(studentSet o1, studentSet o2) {
//                return o1.rollNo - o2.rollNo;
//            }
//        });
//
//        System.out.println(a);

      //Using Lambda expression
        Collections.sort(a, (o1, o2) -> o1.name.compareTo(o2.name));
    }
}
