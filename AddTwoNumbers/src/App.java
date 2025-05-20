public class App {
    public static void main(String[] args) throws Exception {
        // int[] arr1 = { 0 };
        // int[] arr2 = { 0 };
        int[] arr1 = { 9, 9, 9, 9, 9, 9, 9 };
        int[] arr2 = { 9, 9, 9, 9 };

        ListNode l1 = ListNode.createListNode(arr1);
        ListNode l2 = ListNode.createListNode(arr2);

        ListNode.printList(Solution.addTwoNumbers(l1, l2));
    }
}
