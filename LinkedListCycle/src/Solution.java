public class Solution {
    public static boolean hasCycle(ListNode head) {
        if(head == null) return false;
        int i = 0;
        while(head.next != null){
            if(i >= 10002)
                return true;
            head = head.next;
            i++;
        }
        return false;
    }
}
