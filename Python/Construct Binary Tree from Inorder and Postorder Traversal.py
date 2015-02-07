# Definition for a  binary tree node
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    # @param inorder, a list of integers
    # @param postorder, a list of integers
    # @return a tree node
    def buildTree(self, inorder, postorder):
        if len(inorder) == 0 :
            return None
        last = postorder.pop()
        node = TreeNode(last)
        i = inorder.index(last)
        node.right = self.buildTree(inorder[i+1:],postorder)
        node.left = self.buildTree(inorder[0:i],postorder)
        return node