class Solution:
    def removeDuplicates(self, A):
        if not A:
            return 0
        if len(A) == 1 :
            return 1
        count = 0
        for i in range(1, len(A)):
            if A[i] == A[i-1]:
                count = count + 1
            else:
                A[i-count ] = A[i]
        length = len(A) - count     
        return length

