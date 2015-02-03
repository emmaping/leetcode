# Definition for a  binary tree node
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    # @param root, a tree node
    # @return nothing, do it in place
    def flatten(self, root):
        if not root:
            return None

        stack = [root]
        while stack:
            r = stack.pop()
            if r.right:
                stack.append(r.right)
            if r.left:
                stack.append(r.left)
            if stack:
                r.right = stack[-1]
            r.left = None
        
        