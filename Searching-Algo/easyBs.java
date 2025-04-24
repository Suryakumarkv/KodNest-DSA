public class easyBs {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8};
        int key = 6;

        boolean found = false;

        int left = 0;
        int right = a.length-1;
        int mid = (left + right) / 2;

        while(left <= right) {
            if(a[mid] == key) {
                System.out.println("Element found");
                found = true;
                break;
            }
            if(a[mid] > key) {
                right = mid-1;
            } else if(a[mid] < key) {
                 left = mid + 1;

                 mid = (left + right)/2;
            }
        }
            if(!found == true) {
                System.out.println("Element not found");

                
          
        }
    }
}
