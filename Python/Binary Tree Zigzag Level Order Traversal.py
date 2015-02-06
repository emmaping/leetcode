# Definition for a  binary tree node
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    # @param root, a tree node
    # @return a list of lists of integers
    def zigzagLevelOrder(self, root):
        if not root:
            return []
        level = 0
        ret = [[]]
        self.helper(root, level , ret)
        return ret
    
    def helper(self, root, level, ret):
        if not root:
            return None
        if level >= len(ret):
            ret.append([])
        if level % 2:
            ret[level].append(root.val)
        else:
            ret[level].insert(0, root.val)

        self.helper(root.right, level+1, ret)
        self.helper(root.left, level+1, ret)

        
        
        