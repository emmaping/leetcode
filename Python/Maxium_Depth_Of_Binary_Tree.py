"""
Given a binary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
"""
# Definition for a  binary tree node
class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None

class Solution:
    # @param root, a tree node
    # @return an integer
    def maxDepth(self, root):
        if root == None:
            return 0
        else:
            if root.left != None:
                lmax = self.maxDepth(root.left)
            else:
                lmax = 0
            
            if root.right != None:
                rmax = self.maxDepth(root.right)
            else:
                rmax = 0
            return max(lmax, rmax) + 1
        
                
        
        