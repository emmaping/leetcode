# Definition for a point
# class Point:
#     def __init__(self, a=0, b=0):
#         self.x = a
#         self.y = b

class Solution:
    # @param points, a list of Points
    # @return an integer
    def maxPoints(self, points):
        ret = 0
        if len(points) < 2:
            return len(points)
        
        for i in range(len(points)):
            dupPoint = 1
            map = {}
            for j in range(i+1, len(points)):
                if points[i].x == points[j].x and points[i].y == points[j].y:
                    dupPoint += 1
                elif points[i].x == points[j].x:
                    self.helper(float('-inf'), map)
                # elif points[i].y == points[j].y:
                #     self.helper("horizon", map)
                else:
                    bias =(float(points[i].y - points[j].y)/float(points[i].x - points[j].x))
                    self.helper(bias, map)
            if map.values():
                maxI = max(map.values()) + dupPoint
            else:
                maxI = dupPoint
            ret = max(ret, maxI)
        return ret
    def helper(self, key, map):
        if key in map:
            map[key] += 1
        else:
            map[key] = 1