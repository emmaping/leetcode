# Definition for a  binary tree node
class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None

class Solution:
    # @param root, a tree node
    # @param sum, an integer
    # @return a list of lists of integers
    def pathSum(self, root, summary):
        if not root:
            return []
        ret = []
        stack = []
        self.pathstack(root, summary, stack, ret)
        return ret
    
    def pathstack(self, root, summary, stack, ret):
        if not root:
            return
        stack.append(root.val)
        summary = summary - root.val
        if not root.right:
            self.pathstack(root.right, summary, stack[:], ret)
        if not root.left:
            self.pathstack(root.left, summary, stack[:], ret)
        if root.left == None and root.right == None and summary == 0:
            return ret.append(stack)
        

a = TreeNode(1)
a.right = TreeNode(2)        
s = Solution() 
print s.pathSum(a,3)   
        
        