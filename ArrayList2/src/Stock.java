public class Stock {

    public static int profit(int price[]) {
        int min = Integer.MAX_VALUE;
        int profit = 0;

        for(int i=0;i<price.length;i++) {
            if(price[i] < min) {
                min = price[i];
            }
            profit = Math.max(profit, price[i]- min);
        }
        return profit;
    }


    public static void main(String[] args) {
        int price[] = {7,1,5,3,6,4};
        System.out.println(profit(price));
    }
}
