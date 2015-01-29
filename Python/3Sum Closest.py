class Solution:
    # @return an integer
    def threeSumClosest(self, num, target):
        if len(num) <= 3:
            return sum(num)
        
        num.sort()
        ret = num[0] + num[1] + num[2]
        for i in range(len(num) -2):
            j = i + 1
            k = len(num) -1
            while j<k :
                accurate = num[i] + num[j] + num[k]
                if abs(target - ret) > abs(target - accurate):
                    ret = accurate
                    if ret == target:
                        return ret
                if accurate > target:
                    k = k - 1
                else:
                    j = j + 1
                
        return ret
        
        