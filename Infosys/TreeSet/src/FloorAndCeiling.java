import java.util.Scanner;
import java.util.TreeSet;

public class FloorAndCeiling {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            set.add(sc.nextInt());
        }

        int query = sc.nextInt();

        System.out.println("Min=" + set.first());
        System.out.println("Max: " + set.last());
        System.out.println("Floor: " + set.floor(query));
        System.out.println("Ceiling: " + set.ceiling(query));
    }
}
