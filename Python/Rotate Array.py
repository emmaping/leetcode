class Solution:
    # @param nums, a list of integer
    # @param k, num of steps
    # @return nothing, please modify the nums list in-place.
    def rotate(self, nums, k):
        n = len(nums)
        k = k % n
        if k == 0: return
        
        nums[:k], nums[k:] = nums[-k:], nums[:-k]
    
        
        