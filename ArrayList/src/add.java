import java.util.ArrayList;
public class add {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(30);
        list.add(40);
        ArrayList<Float> list2 = new ArrayList<>();
        list2.add(1.5f);
        list2.add(2.5f);
        list2.add(3.5f);
        list2.add(4.5f);
        ArrayList<String> list3 = new ArrayList<>();
        list3.add("1");
        list3.add("Surya");
        list3.add("Kumar");
        list3.add("K V");

        ArrayList<Boolean> list4 = new ArrayList<>();
        list4.add(false); // list.add(element);
        list4.add(true);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list2);
        System.out.println(list2.size());
        System.out.println(list3);
        System.out.println(list3.size());
        System.out.println(list4);
        System.out.println(list4.size());


        System.out.println(list3.get(2)); //list.get(index);

        list.add(2, 108);
        System.out.println(list);

        //Remove
        list3.remove(2);
        System.out.println(list3);

        //Set index at
        list.set(2, 55);
        System.out.println(list);

        //contains
        System.out.println(list3.contains("kumar"));
        System.out.println(list3);

        for(int num: list) {
            System.out.println(num);
        }

        for(int i=0;i<list2.size();i++) {
            System.out.println(list2.get(i));
        }
    }
}
