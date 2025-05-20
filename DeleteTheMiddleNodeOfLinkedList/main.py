# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
def deleteMiddle( head: ListNode) ->ListNode:
    if not head.next:
        return None
    
    if not head.next.next:
        head.next = None
        return head

    # Doing Two Passes 1 pass is to calculate length second pass is to go to the middle
    # length = 0
    # tempHead = head
    # while tempHead:
    #     length += 1
    #     tempHead = tempHead.next
    
    # middle = length // 2
    # tempHead = head
    
    # while middle > 1:
    #     tempHead = tempHead.next
    #     middle -= 1
    # tempHead.next = tempHead.next.next
    # return head

    # Doing one pass traversing through linked list twise the speed to find the middle and other pointer to track middle position
    point1 = head
    point2 = head.next.next
    while point2:
        point2 = point2.next
        if point2:
            point2 = point2.next
            point1 = point1.next
        else:
            break

    point1.next = point1.next.next

    return head

l2 = ListNode(3)
l1 = ListNode(1, l2)

# l4 = ListNode(7)
# l3 = ListNode(4, l4)
# l2 = ListNode(3, l3)
# l1 = ListNode(1, l2)

# l7 = ListNode(6)
# l6 = ListNode(2, l7)
# l5 = ListNode(1, l6)
# l4 = ListNode(7, l5)
# l3 = ListNode(4, l4)
# l2 = ListNode(3, l3)
# l1 = ListNode(1, l2)

l = deleteMiddle(l1)

while l != None:
    print(l.val)
    l = l.next