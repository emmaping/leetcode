class Solution:
    # @return a string
    def longestCommonPrefix(self, strs):
        if not strs:
            return ""
        prefix = list(strs[0])
        if len(strs) == 1:
            return strs[0]
        for str in strs[1:]:
            if len(prefix) < len(str):
                length = len(prefix)
            else:
                length = len(str)
                prefix = prefix[:length]

            if length == 1:
                if prefix[0] == str[0]:
                    prefix = prefix[0]
                else:
                    prefix = []
            else:
                for i in range(length):
                    if prefix[i] != str[i]:
                        prefix = prefix[:i]
                        break
        return ''.join(prefix)
        