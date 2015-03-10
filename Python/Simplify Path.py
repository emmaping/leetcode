class Solution:
    # @param path, a string
    # @return a string
    def simplifyPath(self, path):
        result = []
        pathList = path.split('/')
        for content in pathList:
            if content:
                if content == '..':
                    try:
                        result.pop()
                    except:
                        result = []
                elif content != '.':
                    result.append(content)
        return '/'+'/'.join(result)