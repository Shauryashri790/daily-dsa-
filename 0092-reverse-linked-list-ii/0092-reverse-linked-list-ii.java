class Solution {
    public static void reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode frw = curr.next;
            curr.next = prev;
            prev = curr;
            curr = frw;
        }
    }

    public ListNode reverseBetween(ListNode head, int l, int r) {
        if (head == null || l == r) return head;

        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode temp = dummy;

        for (int i = 1; i <= l - 1; i++) {      
            temp = temp.next;
        }
        ListNode tail1 = temp;                  
        ListNode head2 = temp.next;            

        for (int i = 1; i <= r - l + 1; i++) {
            temp = temp.next;
        }
        ListNode tail2 = temp;                   
        ListNode head3 = temp.next;              
        tail2.next = null;                       
        reverse(head2);

        tail1.next = tail2;                     
        head2.next = head3;                     
        return dummy.next;
    }
}