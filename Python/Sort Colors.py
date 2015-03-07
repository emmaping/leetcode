class Solution:
    # @param A a list of integers
    # @return nothing, sort in place
    def sortColors(self, A):
        if len(A) <= 1:
            return
        m = 0
        n = 0 
        for i in range(len(A)):
            temp = A[i]
            A[i] = 2
            if temp == 0:
                A[m] = 1
                A[n] = 0
                m += 1
                n += 1
            elif temp == 1:  
                A[m] = 1
                m += 1