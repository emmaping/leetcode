class Solution:
  def combine(self, n, k):
    return self.helper(n, k, 1 , [], [])

  def helper(self, n, k, offset, ret, prev):
    if k == 0:
        return ret.append(prev)
    for i in range(offset, n-k+2):
        cur =  prev[:]
        cur.append(i)
        self.helper(n, k-1, i+1,ret, cur)
    return ret