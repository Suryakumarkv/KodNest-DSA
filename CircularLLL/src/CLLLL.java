public class CLLLL {
    private int value;
    private Node head;
    private Node tail;

    public  CLLLL(Node tail, Node head) {
        this.tail = tail;
        this.head = head;
    }

    public CLLLL() {

    }

    //insert At first
    public void insertFirst(int val) {
        Node node = new Node(val);
        if(head == null) {
            head = node;
            tail = node;
            node.next = node; // circular link
            node.prev = node; // circular lin
            return;
        }

        node.next = head;
        head.prev = node;

        tail.next = node;
        node.prev = tail;

        head = node;
    }

//Deletion
    public void DeleteValue(int val) {
        if(head == null) {
             System.out.println("Error: head is null");
        }
        Node node = head;
        if(node.data == val) {
            head = head.next;
            tail.next = head;
            return;
        }

        do {
            Node n=node.next;
            if(n.data == val) {
               node.next = n.next;
               break;
            }
            node = node.next;
        }while(node != head);
    }

    //display
    public void display() {
        if(head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        do {
            System.out.print(temp.data + "->");
            temp = temp.next;
        } while(temp != head);
        System.out.println("(back to head)");
    }

    public class Node{
        int data;
        Node prev;
        Node next;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next, Node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }
}
