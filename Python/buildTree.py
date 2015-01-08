# Definition for a  binary tree node
class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None

class Solution:
    # @param preorder, a list of integers
    # @param inorder, a list of integers
    # @return a tree node
    def buildTree(self, preorder, inorder):
        return self.helper(0, 0 , len(inorder)-1, preorder, inorder)
        
    def helper(self, prestart, instart, inend, preorder, inorder):
        if prestart > len(preorder)-1 or instart > inend:
            return None
        root = TreeNode(preorder[prestart])
        index = 0
        
        for i in range(instart,inend + 1):
            if inorder[i] == root.val:
                index = i
        
        root.left = self.helper(prestart+1, instart, index -1,preorder, inorder)
        root.right = self.helper(prestart+index-instart+1, index+1, inend, preorder, inorder)
        return root
        
        
s = Solution()
s.buildTree([1,2,3],[2,1,3])        
        
    
        