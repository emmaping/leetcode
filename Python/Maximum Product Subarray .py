class Solution:
    # @param A, a list of integers
    # @return an integer
    def maxProduct(self, A):
        if not len(A):
            return 0
        
        maxProduct = A[0]
        minProduct = A[0]
        ret = A[0]
    
        for i in range(1,len(A)):
            temp = maxProduct
            maxProduct = max(maxProduct*A[i], minProduct*A[i], A[i])
            minProduct = min(temp*A[i], minProduct*A[i], A[i])
            ret = max(ret, maxProduct)
            
        return ret
        