class Solution:
    # @param root, a tree node
    # @return a boolean
    def isBalanced(self, root):
        if root == None:
            return True
        left = self.depth(root.left)
        right = self.depth(root.right)
        return abs(left-right) < 2 and self.isBalanced(root.right) and self.isBalanced(root.left)

    def depth(self,root):
        if root == None:
            return 0
        return max(self.depth(root.left),self.depth(root.right)) + 1