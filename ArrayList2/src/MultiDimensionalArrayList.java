import java.lang.reflect.Array;
import java.util.ArrayList;
public class MultiDimensionalArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        mainList.add(list1);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(4);
        list2.add(6);
        list2.add(5);
        list2.add(7);
        mainList.add(list2);

        mainList.add(list2);

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(3);
        list3.add(6);
        list3.add(9);
        mainList.add(list3);

        for(int i=0;i<mainList.size();i++){
            ArrayList<Integer> currList = mainList.get(i);
            for(int j=0;j<currList.size();j++) {
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }
        System.out.println(mainList);


        //Or
        ArrayList<ArrayList<Integer>> mainList2 = new ArrayList<>();
        ArrayList<Integer> list4 = new ArrayList<>();
        ArrayList<Integer> list5 = new ArrayList<>();
        ArrayList<Integer> list6 = new ArrayList<>();

        for(int i=1;i<=5;i++) {
             list4.add(i * 4);
             list5.add(i * 5);
             list6.add(i * 6);
        }
        mainList2.add(list4);
        mainList2.add(list5);
        mainList2.add(list6);
        System.out.println(mainList2);

        for(int i=0;i<mainList2.size();i++) {
            ArrayList<Integer> currList2 = mainList2.get(i);
            for(int j=0;j<currList2.size();j++) {
                System.out.print(currList2.get(j) + " ");
            }
            System.out.println();
        }
    }
}
