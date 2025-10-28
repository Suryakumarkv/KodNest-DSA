import java.util.NoSuchElementException;

public class SinglyLinkedLists {
    private Node head;
    private Node tail;
    private int size;

    public SinglyLinkedLists() {
        this.size = 0;
    }

    private static class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    //maadlebeku at any cost

    //Insert First
    public void insertAtFirst(int val) {
        Node node = new Node(val, head);
            head = node;

        if(tail == null) {
            tail = head;
        }
        size++;
    }

    //Insert Last
    public void insertAtLast(int val) {
        if (tail == null) {
            insertAtFirst(val);
            return;
        }

        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }


    //Insertion on particular position
    public void insertAt(int val,int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }

        if(index == 0) {
            insertAtFirst(val);
            return;
        }

        if(index == size) {
            insertAtLast(val);
            return;
        }
        Node temp = head;
        for(int i = 1; i <index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;
        node.next = temp.next.next;
        size++;

    }

    //Get a particular Node with value
    public Node get(int index) {
        if(index<0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }

        Node temp = head;
        for(int i = 0; i <index; i++) {
            temp = temp.next;
        }
        return temp;
    }


    //Delete at first
    public int deleteFirst() {
        if(head == null) {
            throw new NoSuchElementException("Empty List");
        }

        int value = head.value;
        head = head.next;
        if(head == null) {
            tail = null;
        }
        size--;
        return value;
    }

    //Delete Last
    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }
        Node secondLast = get(size - 2);
        int value = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return value;
    }


    //Delete at particular index
    public int deleteAt(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }

        if(index == 0) {
            return deleteFirst();
        }

        if(index == size - 1) {
            return deleteLast();
        }

        Node prev =  get(index-1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        size--;
        return val;
    }

    //Find particulr value
    public boolean findValue(int value) {
        Node node = head;
        while(node != null) {
            if(node.value == value) {
                return true;
            }
            node = node.next;
        }
        return false;
    }

    //Display
    public void display() {
        Node temp = head;

        while(temp != null) {
            System.out.print(temp.value + "->");
            temp=temp.next;

        }
        System.out.println();
    }

    public static void main(String[] args) {
        SinglyLinkedLists list = new SinglyLinkedLists();
        list.insertAtFirst(1);
        list.insertAtFirst(2);
        list.insertAtFirst(3);
        list.insertAtFirst(4);
        list.insertAtFirst(6);



//        list.insertAtLast(5);
//        list.display();

        list.insertAt(56,3);
        list.display();


//        list.deleteFirst();
//        list.display();

//        list.deleteLast();
//        list.display();

        list.deleteAt(2);
        list.display();
        System.out.println(list.findValue(56));

    }
}
