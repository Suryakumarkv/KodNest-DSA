public class DoubleLLExample {
    private Node head;
    private Node tail;
    int size ;

    //Insert At first
    public void insertAtFirst(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }

        node.next = head;
        if(head != null) {
            head.prev = node;
        }
        head = node;
        node.prev = null;
        size++;
    }

    //Insertion at last
    public void insertAtLast(int val) {
        Node node = new Node(val);

        if(tail == null) {
            insertAtFirst(val);
            return;
        }

        node.prev = tail;
        tail.next = node;
        tail = node;
        node.next = null;
        size++;
    }

    //Insert at a particular position
    public void InsertAtAposi(int posi, int val) {
        Node p = findValue(posi);
        if(p==null) {
            System.out.println("Does not exist");
            return;
        }
        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if(node.next != null) {
            node.next.prev = node;
        }

    }


   //Get a value
    public Node findValue(int val) {
        Node temp = head;
        while(temp != null) {
            temp = temp.next;
            if(temp.data == val) {
                return temp;
            }
        }
        return null;
    }

    public Node get(int index) {
        if(index<0) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }

        Node temp = head;
        for(int i = 0; i <index; i++) {
            temp = temp.next;
        }
        return temp;
    }


    public void DeleteAt(int index) {
        Node temp  = get(index);
        if(temp==null) {
            System.out.println("Does not exist");
            return;
        }

        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
    }


    //Display
    public void display() {
        Node node = head;
        while(node != null) {
            System.out.print(node.data + "->");
            node = node.next;
        }
        System.out.println("End");
    }


    //Reverse display of Elemenst
    public void reverseDisplay() {
        Node last = tail;

        while(last != head) {
            System.out.print(last.data + "->");
            last = last.prev;
        }
        System.out.println("End");
    }

    private class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node prev, Node next) {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }
    }
}
