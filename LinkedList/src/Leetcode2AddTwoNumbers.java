public class Leetcode2AddTwoNumbers {

    // Definition for singly-linked list node
    static class ListNode {
        int val;
        ListNode next;

        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    // Method to add two numbers represented by linked lists
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);  // dummy node
        ListNode ptr = result;
        int carry = 0;

        // iterate until both lists are null
        while (l1 != null || l2 != null) {
            int sum = carry;  // start with previous carry

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10;   // carry for next iteration
            sum = sum % 10;     // digit to store in current node

            ptr.next = new ListNode(sum);
            ptr = ptr.next;
        }

        if (carry > 0) {
            ptr.next = new ListNode(carry);
        }

        return result.next;  // skip dummy node
    }

    // Helper method to create a linked list from array
    public static ListNode createList(int[] nums) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int num : nums) {
            current.next = new ListNode(num);
            current = current.next;
        }
        return dummy.next;
    }

    // Helper method to print linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }

    // Main method to test the program
    public static void main(String[] args) {
        Leetcode2AddTwoNumbers obj = new Leetcode2AddTwoNumbers();

        // Example 1:
        ListNode l1 = createList(new int[]{2, 4, 3});
        ListNode l2 = createList(new int[]{5, 6, 4});

        System.out.print("List 1: ");
        printList(l1);
        System.out.print("List 2: ");
        printList(l2);

        ListNode result = obj.addTwoNumbers(l1, l2);

        System.out.print("Sum:    ");
        printList(result);
    }
}
