class Solution:
    # @param root, a tree node
    # @return a list of lists of integers
    def levelOrderBottom(self, root):
        ret = []
        self.helper(root, 1, ret)
        ret.reverse()
        return ret


    def helper(self, root, level, ret):
        if not root:
            return
        if len(ret) < level:
            ret.append([root.val])
        else:
            ret[level-1].append(root.val)
        self.helper(root.left, level+1, ret)
        self.helper(root.right, level+1, ret)