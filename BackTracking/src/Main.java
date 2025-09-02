class  Main {

    public static void changeArr(int arr[],int i, int val) {   //i = index, val = value
        //base case
        if(i==arr.length) {
            printArray(arr);
            return;
        }

        //Recursion

        arr[i] = val;   //Assigning thew values
        changeArr(arr,i+1,val+1);  // increaseing the value till n(arr.length)
        arr[i] = arr[i]-2; //Downwards decrease by 2
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        changeArr(arr,0,1);
        printArray(arr);
    }
}