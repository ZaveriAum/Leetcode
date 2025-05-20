public class Main {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(4, new ListNode(3, new ListNode(1, new ListNode(2, new ListNode(0)))));
        int [] arr = {1, 3, 0};
        System.out.println(Solution.numComponents(l1, arr));
    }
}