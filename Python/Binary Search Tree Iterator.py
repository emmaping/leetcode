class BSTIterator:
    # @param root, a binary search tree's root node
    def __init__(self, root):
        self.stack = []
        while root:
            self.stack.append(root)
            root = root.left


    # @return a boolean, whether we have a next smallest number
    def hasNext(self):
        return len(self.stack) > 0


    # @return an integer, the next smallest number
    def next(self):
        node = self.stack.pop()
        r = node.right
        while r:
            self.stack.append(r)
            r = r.left
        return node.val