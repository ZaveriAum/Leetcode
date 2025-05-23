class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

class Solution:
    def minDepth( root: TreeNode) -> int:
        return Solution.getMinDepth(float('inf'), root, 1)

    def getMinDepth(minD: int, root: TreeNode, count: int):
        if root == None:
            return 0
        if root.left == None and root.right == None:
            return min(count, minD)
        if root.left != None:
            minD = Solution.getMinDepth(minD, root.left, count + 1)
        if root.right != None:
            minD = Solution.getMinDepth(minD, root.right, count + 1)
        return minD

# a0 = TreeNode(3)
# a1 = TreeNode(9)
# a2 = TreeNode(20)
# a3 = TreeNode(15)
# a4 = TreeNode(7)

# a0.left = a1
# a0.right = a2
# a2.left = a3
# a2.right = a4

a0 = TreeNode(2)
a1 = TreeNode(3)
a2 = TreeNode(4)
a3 = TreeNode(5)
a4 = TreeNode(5)

a0.right = a1
a1.right = a2
a2.right = a3
a3.right = a4

print(Solution.minDepth(a0))