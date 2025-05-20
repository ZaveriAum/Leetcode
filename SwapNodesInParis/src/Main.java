public class Main {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(5, new ListNode(4, new ListNode(3, new ListNode(2, new ListNode(1, new ListNode(6, new ListNode(7)))))));
        Solution sol = new Solution();
        ListNode answer = sol.swapPairs(l1);
        while(answer != null){
            System.out.println(answer.val);
            answer = answer.next;
        }
    }
}