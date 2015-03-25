class Solution:
    # @param A, a list of integers
    # @return an integer
    def firstMissingPositive(self, A):
        for i in range(len(A)):
            target = A[i]
            while 0 < target  and target <= len(A) and target!=A[target-1]:
                temp = A[target-1]
                A[target-1] = target
                target = temp
                
        for i in range(len(A)):
            if A[i] != i+1:
                return i+1
        return len(A)+1
        