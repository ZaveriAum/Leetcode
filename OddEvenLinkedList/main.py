# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
def oddEvenList( head: ListNode) -> ListNode:
    if not head or not head.next or not head.next.next:
        return head

    odd = head
    odd2 = odd
    even = head.next
    even2 = even
    while odd.next and even.next:
        odd.next = odd.next.next
        odd = odd.next
        even.next = even.next.next
        even = even.next
    
    odd.next = even2
    head = odd2

    return head

# l5 = ListNode(5)
# l4 = ListNode(4, l5)
# l3 = ListNode(3, l4)
# l2 = ListNode(2, l3)
# l1 = ListNode(1, l2)
# [2,1,3,5,6,4,7]
l7 = ListNode(7)
l6 = ListNode(4, l7)
l5 = ListNode(6, l6)
l4 = ListNode(5, l5)
l3 = ListNode(3, l4)
l2 = ListNode(1, l3)
l1 = ListNode(2, l2)

l = oddEvenList(l1)

while l:
    print(l.val)
    l = l.next