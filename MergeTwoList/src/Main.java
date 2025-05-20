public class Main {
    public static void main(String[] args) {
        ListNode l1 = new ListNode();
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode l3 = MergeTwoList.mergeTwoLists(l1, l2);

        while(l3!= null){
            System.out.println(l3.val + " ");
            l3 = l3.next;
        }
    }
}