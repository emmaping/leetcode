# Definition for a  binary tree node
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    # @return a list of tree node
    def generateTrees(self, n):
        return self.generate(1,n)
        
    
    def generate(self, left , right):
        if left == right: return[TreeNode(left)]
        if left > right: return [None]
        
        ret = []
        for i in range(left, right+1):
            lefttree = self.generate(left,i-1)
            righttree = self.generate(i+1, right)
            for l in lefttree:
                for r in righttree:
                    node = TreeNode(i)
                    node.left = l
                    node.right = r
                    ret.append(node)
        return ret
        
        