# Definition for a  binary tree node
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    # @param root, a tree node
    # @return a list of integers
    def inorderTraversal(self, root):
        ret = []
        if not root:
            return ret

        stack = []
        cur = root
        while cur!=None or len(stack) != 0:
            while cur != None:
                stack.append(cur)
                cur = cur.left
            cur = stack.pop()
            ret.append(cur.val)
            cur = cur.right
        return ret