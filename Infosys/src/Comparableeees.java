import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparableeees {
    public static void main(String[] args) {
        List<studentSet> a = new ArrayList<>();
        a.add(new studentSet(1,"Surya"));
        a.add(new studentSet(2,"ak"));
        a.add(new studentSet(4,"kumar"));
        a.add(new studentSet(3,"hk"));

        studentSet s1 = new studentSet(1,"kumar");
        studentSet s2 = new studentSet(3,"hk");

//        Collections.sort(a);
//        System.out.println(a);

        System.out.println(s1.compareTo(s2));

    }
}
