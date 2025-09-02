import java.util.ArrayList;
public class PairSumOne_TwoPointer {

    public static boolean pairSum(ArrayList<Integer> list2, int target) {
        int lp = 0;
        int rp = list2.size() - 1;
        while (lp < rp) {
            if(list2.get(lp) + list2.get(rp) == target){
                return true;
            } else if(list2.get(lp) + list2.get(rp) < target) {
                lp++;
            } else if(list2.get(lp) + list2.get(rp) > target) {
                rp--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);

        int target = 5;
        System.out.println(pairSum(list2, target));
    }
}
