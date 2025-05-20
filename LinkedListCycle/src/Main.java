public class Main {
    public static void main(String[] args) {
        ListNode l1;
        ListNode l2 = null;
        ListNode l3;
        ListNode l4;

//        l4 = new ListNode(4, l2);
//        l3 = new ListNode(3, l4);
        l2 = new ListNode(2);
        l1 = new ListNode(1, l2);

        if (Solution.hasCycle(l1)) System.out.println("lol");
    }
}