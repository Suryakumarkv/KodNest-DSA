import java.util.ArrayList;

public class PairSumBruteForce {
    public static ArrayList<Integer> pairSum(ArrayList<Integer> list1, int target){

        for(int i=0;i<list1.size();i++){
            for(int j=i+1;j<list1.size();j++) {
                int sum = list1.get(i)+list1.get(j);
                if(sum==target){
                    ArrayList<Integer> result = new ArrayList<>();
                    result.add(list1.get(i));
                    result.add(list1.get(j));
                    return result;
                }
            }
        }
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);

        int target = 6;
        System.out.println(pairSum(list1,target));
    }
}
