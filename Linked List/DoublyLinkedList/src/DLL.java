public class DLL {
    Node head;
    Node tail;

    //insert at first
    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next=head;
        node.prev=null;
        if(head != null) {
            head.prev = node;
        }
        head = node;
    }

    public void insertLast(int val) {
        Node node = new Node(val);
        Node last=head;

        if(head==null) {
            node.prev=null;
            head=node;
            return;
        }
        while(last.next!=null) {
            last=last.next;
        }
        node.next=null;
        last.next=node;
        node.prev=last;
    }

    public Node find(int val) {
        Node temp  = head;
        while(temp!=null) {
            temp=temp.next;
            if(temp.val == val) {
                return temp;
            }
        }
        return null;
    }

    public void insert(int after, int val) {
        Node p = find(after);
        if(p==null) {
            System.out.println("Does not exist");
            return;
        }

        Node node = new Node(val);
        node.next=p.next;
        p.next = node;
       node.prev = p;
       if(node.next != null) {
           node.next.prev = node;
       }
    }

    public void display() {
        Node temp = head;
        Node last = null;
        System.out.print("Forward: ");
        while(temp != null) {
            System.out.print( temp.val + " -> ");
            last = temp;
            temp = temp.next;
        }
        System.out.println();

        System.out.println("END");

        //Not using tail just using an temporary variable called => last
        System.out.println("Displaying in reverse");
        System.out.print("Backward: ");
        while(last != null) {
            System.out.print(last.val + "->");
            last = last.prev;
        }
    }



    private class Node {
        int val;
        Node prev;
        Node next;

       public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node prev, Node next) {
            this.val = val;
            this.prev = prev;
            this.next = next;
        }
    }
}
