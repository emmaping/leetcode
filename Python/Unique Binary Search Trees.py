class Solution:
    # @return an integer
    def numTrees(self, n):
        Num=[1,1]+[0]*n;
        for i in range(2,n+1):
            for j in range(i):
                Num[i]+=Num[j]*Num[i-j-1];
        return Num[n];