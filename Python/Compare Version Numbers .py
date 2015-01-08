class Solution:
    # @param version1, a string
    # @param version2, a string
    # @return an integer
    def compareVersion(self, version1, version2):
        list1 = [int(i) for i in (version1.split("."))]
        list2 = [int(i) for i in (version2.split("."))]
        
        length = len(list1) if len(list1) <= len(list2) else len(list2)
        i = 0
        while i< length:
            if list1[i] > list2[i]:
                return 1
            elif list1[i] < list2[i]:
                return -1

            i = i + 1
            
        if len(list1)>length:
            if sum(list1[length:]) != 0:
                return 1
            else:
                return 0
        elif len(list2) > length:
            if sum(list2[length:]) != 0:
                return -1
            else:
                return 0
        else:
            return 0
s = Solution()
print s.compareVersion("1", "1.0")