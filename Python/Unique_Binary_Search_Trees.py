"""
Given n, how many structurally unique BST's (binary search trees) that store values 1...n?

For example,
Given n = 3, there are a total of 5 unique BST's.

   1         3     3      2      1
    \       /     /      / \      \
     3     2     1      1   3      2
    /     /       \                 \
   2     1         2                 3
   
"""
class Solution:
    # @return an integer
    def numTrees(self, n):
        Num=[1,1]+[0]*n;
        for i in range(2,n+1):
            for j in range(i):
                Num[i]+=Num[j]*Num[i-j-1];
        return Num[n];