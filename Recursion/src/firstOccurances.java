public class firstOccurances {

    public static void main(String[] args) {
        int arr[] = {8,3,6,9,5,10,2,5,3};
        int key = 5;
       System.out.println(occurance(arr, key,0));
    }

    public static int occurance(int arr[],int key,int i) {
        if(key==arr.length){
            return arr.length;
        }
        if(arr[i] == key) {
            return i;
        }
        return occurance(arr, key, i+1);
    }
}
