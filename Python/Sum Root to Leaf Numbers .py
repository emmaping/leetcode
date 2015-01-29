# Definition for a  binary tree node
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    # @param root, a tree node
    # @return an integer
    def sumNumbers(self, root):
        if not root:
            return 0

        if (not root.left) and (not root.right):
           return root.val
        val = 0
           
        if root.left:
            root.left.val += root.val * 10
            val += self.sumNumbers(root.left)
            root.left.val -= root.val * 10
            
        if root.right:
            root.right.val += root.val * 10
            val += self.sumNumbers(root.right)
            root.right.val -= root.val * 10
        
        return val
        
    
        