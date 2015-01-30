class Solution:
    # @return a list of lists of length 4, [[val1,val2,val3,val4]]
    def fourSum(self, num, target):
        res = []
        if len(num) < 4:
            return res

        num.sort()

        for i in range(len(num) -2):
            for v in range(i+1, len(num)-1):
                j = v + 1
                k = len(num) -1
                while j<k :
                    cur = num[i] + num[j] + num[k] + num[v]
                    if cur == target and not [num[i], num[v], num[j],num[k]] in res:
                        res.append([num[i], num[v], num[j],num[k]])
                        k = k-1;
                        j = j+1;
                        while (j<k-1 and num[k] == num[k+1]):
                            k = k-1
                        while (j<k-1 and num[j] == num[j-1]):
                            j = j+1
      
                    elif cur > target:
                        k = k - 1
                    else:
                        j = j + 1

        return res