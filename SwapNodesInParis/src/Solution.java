class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode tempHead = head;
        ListNode futureNode = null;

        tempHead.next = tempHead.next.next;
        tempHead = tempHead.next.next;

        return tempHead;
    }
}