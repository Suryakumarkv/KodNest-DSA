import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class CustomSet {
    public static void main(String[] args) {
        Set<studentSet> a = new LinkedHashSet<>();
        a.add(new studentSet(1,"Surya"));
        a.add(new studentSet(2,"ak"));
        a.add(new studentSet(3,"Syan"));
        a.add(new studentSet(1,"Kumar"));
        System.out.println(a);
    }
}
