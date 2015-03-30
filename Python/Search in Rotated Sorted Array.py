class Solution:
    # @param A, a list of integers
    # @param target, an integer to be searched
    # @return an integer
    def search(self, A, target):
        low=0
        high=len(A)-1
        
        # find the index of the smallest value using binary search.
        # Loop will terminate since mid < hi, and lo or hi will shrink by at least 1.
        # Proof by contradiction that mid < hi: if mid==hi, then lo==hi and loop would have been terminated.
        while low < high :
            mid=(low + high)//2;
            if A[mid] > A[high] : low = mid + 1
            else: high = mid
        
        pivot = low
        newList = A[pivot:] + A[:pivot]
        low = 0
        high = len(A)-1  
        while low <=high :
            mid=(low + high)//2
            if newList[mid] == target : return (mid + pivot) % len(A)
            if newList[mid] < target :low=mid+1
            else: high = mid-1

        return -1
        