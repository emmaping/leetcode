class Solution:
    # @param ratings, a list of integer
    # @return an integer
    def candy(self, ratings):
        length = len(ratings)
        if length <= 1: return length
        
        left = [1] * length
        right = [1] * length
        
        for i in range(length - 1):
            j = length - 1 -i
            
            if ratings[i+1] > ratings[i]:
                left[i+1] = left[i] + 1
            
            if ratings[j-1] > ratings[j]:
                right [ j - 1] = right[j] + 1
        
        ret = 0
        for i in range(length):
            ret += max(left[i], right[i])
        return ret
        
        