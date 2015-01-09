class Solution:
    # @param root, a tree node
    # @return a boolean
    def checkSymmetric(self,leftnode, rightnode):
        if leftnode == rightnode == None:
            return True
        elif rightnode== None or leftnode == None:
            return False
        return rightnode.val == leftnode.val and self.checkSymmetric(leftnode.left, rightnode.right) and self.checkSymmetric(leftnode.right, rightnode.left)
        
    def isSymmetric(self, root):
        if root == None:
            return True
        return self.checkSymmetric(root.left, root.right)
