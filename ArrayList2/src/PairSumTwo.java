import java.util.ArrayList;
public class PairSumTwo {
    public static boolean ToePairSum(ArrayList<Integer> list2, int target) {
        int pivot = -1;
        for (int i = 0; i < list2.size(); i++) {
            if(list2.get(i) > list2.get(i+1)) {
                pivot = i;
                break;
            }
        }

        int lp = pivot+1;
        int rp = pivot; //Largest Element
        while (lp != rp) {
            //case1
            if(list2.get(lp) + list2.get(rp)  == target) {
                return true;
                //Case 2 -> rp > target
            } else if(list2.get(lp) + list2.get(rp) > target) {
                //Modular Arithmetic
                rp = (list2.size()+ rp - 1)% list2.size();

                //case 3 => lp < target
            } else if(list2.get(lp) + list2.get(rp)  < target) {
                lp = (lp + 1)% list2.size();
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list2 = new ArrayList<>();

        //Sorted and rotated
        list2.add(11);
        list2.add(15);
        list2.add(6);
        list2.add(8);
        list2.add(9);
        list2.add(10);

        int taget = 16;
        System.out.println(ToePairSum(list2, taget));
    }
}
