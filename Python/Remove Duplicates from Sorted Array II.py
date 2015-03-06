class Solution:
    # @param A a list of integers
    # @return an integer
    def removeDuplicates(self, A):
        count = 0
        popout = []
        length = len(A)
        if length < 3:
            return length
        for i in range(1, length-1):
            if A[i] == A[i-1] and A[i] == A[i+1]:
                popout.append(i)
        print popout
        for j in range(len(popout)):
            A.pop(popout[j]-1 -j)

        print A
        return length - len(popout)
            
        
s = Solution()
s.removeDuplicates([0,1,2,2,2,2,2,3,4,4,4])       