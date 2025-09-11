public class singlyLinkedList {

    private Node head;
    private Node tail;
    private int size;

    public singlyLinkedList() {
        this.size = 0;
    }

    // Insert at first
    public void insertFirst(int val) {
        Node node = new Node(val, head);
        head = node;

        if (tail == null) {
            tail = head;
        }
        size++;
    }

    // Insert at last
    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    // Insert at a particular index
    public void insertAtParticularIndex(int val, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    // Delete first
    public int deleteFirst() {
        if (head == null) throw new IllegalStateException("List is empty");

        int value = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return value;
    }

    // Delete last
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

    // Delete at particular index
    public int delete(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }

        Node prev = get(index - 1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        size--;
        return val;
    }

    // Find a particular value
    public Node findValue(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    // Get node at index
    public Node get(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    // Display list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }

    // Insert using recursion
    public void insertRecursion(int val, int index) {
        if (index < 0 || index > size) throw new IndexOutOfBoundsException();
        head = insertRec(val, index, head);
    }

    private Node insertRec(int val, int index, Node node) {
        if (index == 0) {
            Node temp = new Node(val, node);
            size++;
            return temp;
        }

        node.next = insertRec(val, index - 1, node.next);
        return node;
    }

    // Merge two sorted linked lists
    public static singlyLinkedList merge(singlyLinkedList firstList, singlyLinkedList secondList) {
        singlyLinkedList merged = new singlyLinkedList();
        Node f = firstList.head;
        Node s = secondList.head;

        while (f != null && s != null) {
           if(f.value < s.value) {
               merged.insertLast(f.value);
               f = f.next;
           } else {
               merged.insertLast(s.value);
               s = s.next;
           }
        }

        while (f != null) {
            merged.insertLast(f.value);
            f = f.next;
        }

        while (s != null) {
            merged.insertLast(s.value);
            s = s.next;
        }

        return merged;
    }

    // Node class
    private static class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    // Main method
    public static void main(String[] args) {
        singlyLinkedList s = new singlyLinkedList();
        s.insertLast(1);
        s.insertLast(1);
        s.insertLast(1);
        s.insertLast(2);
        s.insertLast(4);
        s.insertLast(4);
        s.display();

        // Test recursive insert


        // Test merge
        singlyLinkedList s2 = new singlyLinkedList();
        s2.insertLast(0);
        s2.insertLast(3);
        s2.insertLast(5);

        s2.display();

        singlyLinkedList merged = merge(s, s2);
        merged.display();
    }
}
