public class RemoveDuplicateFromSortedList {
    private Node head;
    private Node tail;
    private int size;

    public RemoveDuplicateFromSortedList() {
        this.size = size;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null) {
            tail = head;
        }
        size += 1;
    }


    //Insert at last
    public void insertLast(int val) {
        if(tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail =  node;
        size += 1;
    }


    //o(n) complexity
    public void removeDuplicates() {
        Node node = head;
        while(node.next != null) {
            if(node.value == node.next.value) {
                node.next = node.next.next;
                size--;
            } else {
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }

    public void display() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next; //temp++ till it becames null
        }
        System.out.println("End");
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }

        public Node(Node next, int value) {
            this.next = next;
            this.value = value;
        }
    }

    public static void main(String[] args) {
        RemoveDuplicateFromSortedList s=new RemoveDuplicateFromSortedList();
         s.insertLast(1);
         s.insertLast(1);
         s.insertLast(1);
         s.insertLast(2);
         s.insertLast(4);
         s.insertLast(4);
         s.display();
        s.removeDuplicates();
        s.display();
    }



}
