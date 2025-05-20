public class Main {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode l3 = new ListNode();
        Solution.PrintList(l1);
        System.out.println();
        Solution.PrintList(l3);
        System.out.println();
        ListNode l2 = Solution.reverseList(l1);
        ListNode l4 = Solution.reverseList(l3);
        Solution.PrintList(l4);
        System.out.println();
        Solution.PrintList(l2);
    }
}