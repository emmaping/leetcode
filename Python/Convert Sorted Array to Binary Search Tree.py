class Solution:
    # @param num, a list of integers
    # @return a tree node
    def sortedArrayToBST(self, num):
        if not num:
            return None
        length = len(num)
        node = TreeNode(num[length//2])
        node.left = self.sortedArrayToBST(num[:length//2] if length//2 else None)
        node.right = self.sortedArrayToBST(num[length // 2 +1 :] if length //2 < length-1 else None)
        
        return node