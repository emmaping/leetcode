class Solution:
    def isSameTree(self, p, q):
        if p == q == None:
            return True
        elif p == None or q == None:
            return False
        elif p.val == q.val:
            return self.isSameTree(p.right, q.right) and self.isSameTree(p.left, q.left)
        else:
            return False
