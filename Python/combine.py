class Solution:
  def combine(self, n, k):
    return self.combine2(n, k, 1 , [], [])

  def combine2(self, n, k, offset, collects, prev):
    if k == 0:
        return collects.append(prev)
    for i in range(offset, n-k+2):
        me = list(prev)
        me.append(i)
        self.combine2(n, k-1, i+1, collects, me)
    return collects

s = Solution()
s.combine(5,2)