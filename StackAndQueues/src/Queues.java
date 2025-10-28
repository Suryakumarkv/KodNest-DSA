public class Queues {
 int[] data;
 private static final int DEFAULT_SIZE = 10;
 int end= 0;

    public Queues() {
        this(DEFAULT_SIZE);
    }

    public Queues(int size) {

        this.data = new int[size];
    }

    public boolean isEmpty() {

        return end == 0;
    }

    public boolean isFull() {

        return end == data.length;
    }

    public boolean insertData(int item) {
        if(isFull()) {
            return false;
        } else {
            data[end] = item;
            end++;
            return true;
        }
    }

    public int remove() throws Exception {
        if(isEmpty()) {
             throw new Exception("Queue is Empty");
        }

        int removed = data[0];
        for(int i=1;i<end;i++) {
            data[i-1] = data[i];
        }
        end--;
        return removed;
    }

    public void display() {
        for(int i=0;i<end;i++) {
            System.out.print(data[i]+" ");
        }
        System.out.println("END");
    }

}
