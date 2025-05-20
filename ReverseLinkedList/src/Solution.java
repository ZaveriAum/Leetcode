public class Solution {
    public static ListNode reverseList(ListNode head) {
//        ListNode result = null;
//        ListNode temp = head;
//        if(head.next == null){
//            return head;
//        }
//        while(true) {
//            ListNode copy = result;
//            if(temp.next == null){
//                while (copy.next != null)
//                    copy = copy.next;
//
//                copy.next = new ListNode(temp.val);
//                temp = head;
//                break;
//            }
//            while (temp.next.next != null)
//                temp = temp.next;
//
//
//            ListNode newNode = new ListNode(temp.next.val);
//            temp.next = null;
//            if (result == null) {
//                result = newNode;
//                temp = head;
//                continue;
//            }
//            while (copy.next != null)
//                copy = copy.next;
//
//            copy.next = newNode;
//            temp = head;
//        }
//        return result;

        ListNode node = null;

        while (head != null) {
            ListNode temp = head.next;
            head.next = node;
            node = head;
            head = temp;
        }

        return node;
    }

    public static void PrintList(ListNode head){
        if(head == null) return;
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.val + ", ");
            temp = temp.next;
        }
    }
}
