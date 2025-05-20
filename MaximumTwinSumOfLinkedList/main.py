# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

def pairSum(head: ListNode) -> int:
    if not head.next.next:
        return head.val + head.next.val
    fast = head.next.next
    maxS = float('-inf')
    leftHalf = []
    leftHalf.append(head.val)
    while fast:
        head = head.next
        leftHalf.append(head.val)
        fast = fast.next.next
    head = head.next
    for i in leftHalf[::-1]:
        maxS = max(maxS, (head.val + i))
        head = head.next
    return maxS;

# l4 = ListNode(4)
# l3 = ListNode(2, l4)
l2 = ListNode(2)
l1 = ListNode(3, l2)

print(pairSum(l1))