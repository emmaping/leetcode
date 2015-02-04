class Solution:
    # @param num, a list of integer
    # @return an integer
    def findMin(self, num):
        low=0
        high=len(num)-1

        while low < high :
            mid=(low + high)//2;
            if num[mid] > num[high] : low = mid + 1
            else: high = mid
        
        return num[low]