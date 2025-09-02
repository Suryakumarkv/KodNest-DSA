package ContainerWithMostWater;
import java.util.ArrayList;
public class TwoPointer {
    public static int storeWater(ArrayList<Integer> height) {
        int maxWater =  Integer.MIN_VALUE;
        int lp = 0;
        int rp = height.size()-1;
        while(lp < rp) {
            int height1 = Math.min(height.get(lp), height.get(rp));
            int width = rp - lp;
            int currentWater = height1 * width;
            maxWater = Math.max(maxWater, currentWater);

            if(height.get(lp) < height.get(rp)) {
                lp++;
            } else {
                rp--;
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(storeWater(height) + " is the maximum water stored");
    }
}
