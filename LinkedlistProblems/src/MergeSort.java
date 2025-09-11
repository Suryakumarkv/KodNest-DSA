public class MergeSort {

public ListNode sortList(ListNode head) {
    if(head==null || head.next==null) return head;

    ListNode mid = getMid(head);
    ListNode left = sortList(head);
    ListNode right = sortList(mid);

    return mergeTwoLists(left,right);

}

//For Merging the lists
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode merged = new ListNode();
        ListNode tail = merged;

        while (list1 != null && list2 != null) {
            if(list1.val < list2.val) {
                tail.next = list1;
                list1 = list1.next;
                tail = tail.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
                tail = tail.next;
            }
        }
        tail.next = (list1 != null) ? list1 : list2;
        return merged.next;
    }

    //For finding the middle
    public ListNode getMid(ListNode head) {
        ListNode prev = null;
        ListNode s = head;
        ListNode f = head;
        while(f != null && f.next != null) {
            prev = s;
            f = f.next.next;
            s = s.next;
        }
        if(prev != null) {
            prev.next = null;
        }
        return s;
    }


    public ListNode reverseList(ListNode head) {
        if(head==null) return head;

        ListNode prev = null;
        ListNode present = head;
        ListNode next = present.next;

        while(present != null) {
            present.next = prev;
            prev = present;
            present = next;
            if(next != null) next = next.next;
        }
        return prev;
    }


    public void reorderList(ListNode head) {
        ListNode mid = getMid(head);
        ListNode hs = reverseList(mid);
        ListNode hf = head;

        while(hs.next != null && hf.next != null) {
            ListNode temp = hs.next;
            hf.next = hs;
            hs = temp;

            temp = hs.next;
            hs.next = hf;
            hs = temp;
        }

        //setting last element to tail
        if(hf != null) {
            hf = null;
        }
    }

    public boolean isPalindrome(ListNode head) {
         ListNode mid = getMid(head);
         ListNode headSeconde = reverseList(mid);
         ListNode reverseNode = headSeconde;

         while(head != null && headSeconde!=null) {
             if(head.val != headSeconde.val) {
                 break;
             }
             head = head.next;
             headSeconde = headSeconde.next;
         }
         reverseList(reverseNode);
         if(head ==  null || headSeconde==null) ;
        return true;
    }

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val)
        { this.val = val; }
      ListNode(int val, ListNode next){
          this.val = val;
          this.next = next;
      }
 }
}
