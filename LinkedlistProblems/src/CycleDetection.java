class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class CycleDetection {
    public  boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    public int lengthOfCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow) {
                ListNode temp = slow;
                int length = 0;
                do {
                    temp = temp.next;
                    length++;
                } while (temp != slow);
                return length;
            }
        }
        return 0;
    }

    public ListNode detectCycle(ListNode head) {
        int length = 0;

        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                length = lengthOfCycle(slow);
                break;
            }
        }
        if(length == 0) {
            return null;
        }
            ListNode first = head;
            ListNode second = head;

            while(length < 0) {
                second = second.next;
                length--;
            }

            while(first != second) {
                first = first.next;
                second = second.next;
            }

        return second;
    }

    public static void main(String[] args) {
        CycleDetection obj = new CycleDetection();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        System.out.println(obj.hasCycle(head)); // false

        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(3);
        head2.next.next.next = new ListNode(4);
        head2.next.next.next.next = head2.next; // cycle: 4 -> 2

        System.out.println(obj.hasCycle(head2));//
        // true
        System.out.println(obj.lengthOfCycle(head2));
        System.out.println(obj.detectCycle(head2));
    }
}
