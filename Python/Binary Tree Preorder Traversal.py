class Solution:
    # @param root, a tree node
    # @return a list of integers
    def preorderTraversal(self, root):
        nodes = []
        result = []
        
        if root== None:
            return result
        nodes.append(root)
        while nodes:
            node = nodes.pop()

            result.append(node.val)
            if node.right:
                nodes.append(node.right)
            if node.left:
                nodes.append(node.left)

        return result
