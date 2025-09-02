package Arrays;
public class linear {
    public static void search(int sea[]) {
        boolean found = false;
        int target = 6;
        for(int i=0;i<sea.length;i++) {
            if(sea[i] == target) {
                found = true;
                System.out.println("Found");
                break;
            }
        }

            if(found == false) {
                System.out.println("Not found");
            }
}


    public static void main(String[] args) {
        int sea[] = {4, 2, 5, 6 , 8};
        search(sea);
    }
}
