# Definition for a  binary tree node
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    # @param root, a tree node
    # @return an integer
    value = float('-inf')
    def maxPathSum(self, root):
        self.helper(root)
        return self.value
        
    def helper(self, root ):
        if not root: return 0
        left = max(0, self.helper(root.left))
        right = max(0, self.helper(root.right))
        self.value = max(self.value, left+right+root.val)
        return max(left, right) + root.val
        