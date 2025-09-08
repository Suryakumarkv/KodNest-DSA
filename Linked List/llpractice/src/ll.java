public class ll {

    private Node head;
    private Node tail;
    private int size;

    public  void insertFirst(int val) {

        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null) {
            tail = head;
        }

    }

    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val); // safe only if insertFirst handles tail properly
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;

    }


    //Insert at particular posi
    public void inserAt(int val, int index) {
        Node temp = head;
        if(index == 0) {
            insertFirst(val);
            return;
        }
        if(index == size) {
           insertLast(val);
           return;
        }

        for(int i=1;i<index;i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
    }


    //Delete first
    public int deleteFirt() {
        int val = head.val;
        head = head.next;
        if(head == null) {
            tail = null;
        }
        return val;
    }

    public void display() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }


    private class Node {
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
}
