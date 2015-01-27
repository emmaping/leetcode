# Definition for a undirected graph node
# class UndirectedGraphNode:
#     def __init__(self, x):
#         self.label = x
#         self.neighbors = []

class Solution:
    # @param node, a undirected graph node
    # @return a undirected graph node
    def cloneGraph(self, node):
        return self.cloneHelper(node, {})
    
    def cloneHelper(self, node, visited):
        if not node:
            return None
           
        retNode = UndirectedGraphNode(node.label)
        visited[node.label] = retNode
        
        for neighbor in node.neighbors:
            if not neighbor.label in visited.keys():
                neighbornode = self.cloneHelper( neighbor, visited)
                visited[neighbor.label] = neighbornode
            retNode.neighbors.append(visited[neighbor.label])
        return retNode
            
        