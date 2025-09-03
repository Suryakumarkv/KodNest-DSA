public class singlyLinkedList {

    private Node head;
    private Node tail;

    private int size;

    public singlyLinkedList() {
        this.size = 0;
    }

    //Insert at First
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


    //Insert at a particular index
    public void insertAtParticularIndex(int val, int index) {
         Node temp = head;

         if(index < 0 || index > size) {
             throw new IndexOutOfBoundsException();
         }

         if(index == 0) {
             insertFirst(val);
             return;
         }
         if(index == size) {
             insertLast(val);
             return;
         }

         for(int i = 1; i < index; i++) {
             temp = temp.next;   //increase temp till we reach the index -1
         }
        Node node = new Node(temp.next, val);
         temp.next = node;
    }


    //Delete first
    public int deleteFirst() {
        int value = head.value;
        head = head.next;
        if(head == null) {
            tail = null;
        }
        size--;
        return value;
    }

  ///Delete at last


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
        }

        public Node(Node next, int value) {
            this.next = next;
            this.value = value;
        }
    }
}
