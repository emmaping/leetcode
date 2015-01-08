
class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None

class Solution:
    # @param root, a tree node
    # @return a list of lists of integers
    def zigzagLevelOrder(self, root):
        if not root:
            return []
        level = 0
        ret = [[]]
        return self.helper(root, level , ret)
        
    
    def helper(self, root, level, ret):
        if not root:
            return None
        if level >= len(ret):
            ret.append([])
        ret[level].append(root.val)
        if root.left:
            self.helper(root.left, level+1, ret)
        if root.right:
            self.helper(root.right, level+1, ret)
        return ret

root = TreeNode(1)
root.left = TreeNode(2)   
root.right = TreeNode(3) 
s = Solution()
s.zigzagLevelOrder(root)