public class linear_search {
   public static int linear_search(int marks[],int key){
    for(int i=0;i<=marks.length;i++) {
        if(marks[i] == key) {
            return i;
        } 
        }
   return -1;
   }
    public static void main(String[] args) {
        int marks[] = {12,95,45,68,78,69};
        int key = 45;
        int index = linear_search(marks, key);
        if(index == -1) {
            System.out.println("Key not found");
        } else {
            System.out.println("The key is at the index " + index);
        }
    
    }
}
