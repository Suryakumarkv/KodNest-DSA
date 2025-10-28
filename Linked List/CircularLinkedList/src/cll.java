public class cll {

    private Node head;
    private Node tail;

    public cll(Node tail, Node head) {
        this.tail = null;
        this.head = null;
    }


    //Insertion at Last
    public void insertLast(int val) {
        Node node = new Node(val);
        if(head == null) {
            head = node;
            tail = node;

        }
        tail.next = node;
        tail = node;
        node.next = head;
    }

  //Display
    public void display() {
        Node node = head;
        if(head != null) {
            do {
                System.out.print(node.value + "->");
                node= node.next;
            } while(node != head);
        }
    }

    //Delete
    public void delete(int val) {
        Node node = head;
        if(head == null) {
            return;
        }

        if(node.value == val) {
            head = head.next;
            tail.next = head;
            return;
        }

        do {
            Node n =  node.next;
            if(n.value == val) {
                node.next = n.next;
                break;
            }
            node = node.next;
        } while(node != head);
    }




     class Node {
         int value;
         Node next;

         public Node(int value){
             this.value=value;
         }

         public Node(int value, Node next) {
             this.value = value;
             this.next = next;
         }
     }
}
