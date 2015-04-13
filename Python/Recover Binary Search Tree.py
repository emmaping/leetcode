# Definition for a  binary tree node
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    # @param root, a tree node
    # @return nothing, modify the binary tree in-place instead.
    def recoverTree(self, root):
        if(root==None):return None
        else:
            stack=[]
            self.genStack(root,stack)
            vals= map(lambda x:x.val,stack)
            vals=sorted(vals)
    
            for i in range(len(stack)):
                stack[i].val=vals[i]
    
    def genStack(self, node,stack):            
        if(node==None):return
        self.genStack(node.left,stack)
        stack.append(node)
        self.genStack(node.right,stack)