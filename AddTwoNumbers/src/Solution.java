public class Solution {
    /**
     * AddTwoNumbers
     * ? Do this until both of the list is null
     * TODO_1. sum = currentListNode1.value + currentListNode2.value
     * TODO_2. if sum >= 10 then passer = sum // 10;
     * TODO_3. newListNode = sum % 10;
     * 
     */
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = null;
        int sum = 0;
        int passer = 0;
        int newVal = 0;
        ListNode newNode = null;
        do {
            if (l1 == null) {
                sum += 0;
            } else {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 == null) {
                sum += 0;
            } else {
                sum += l2.val;
                l2 = l2.next;
            }
            sum += passer;
            if (sum >= 10) {
                passer = (int) sum / 10;
                newVal = sum - 10;
            } else {
                newVal = sum;
                passer = 0;
            }
            // add the value to the linked list
            newNode = new ListNode(newVal);
            if (result == null) {
                result = newNode;
            } else {
                ListNode temp = result;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = newNode;
            }
            sum = 0;
        } while (l1 != null || l2 != null); // until both of the list is null
        if (passer != 0) {
            newNode = new ListNode(passer);
            ListNode temp = result;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            sum = 0;
        }
        return result;
    }
}
