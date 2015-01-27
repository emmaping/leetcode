/**
 * Definition for undirected graph.
 * class UndirectedGraphNode {
 *     int label;
 *     List<UndirectedGraphNode> neighbors;
 *     UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
 * };
 */
public class Solution {
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        return cloneHelper(node, new HashMap<Integer,UndirectedGraphNode>());
        
    }
    private UndirectedGraphNode cloneHelper(UndirectedGraphNode node, Map<Integer,UndirectedGraphNode> visited){
        if (node == null) return null;
        UndirectedGraphNode retNode = new UndirectedGraphNode(node.label);
        visited.put(node.label, retNode);
        for (UndirectedGraphNode neighbor: node.neighbors){
            if (visited.get(neighbor.label) == null){
                UndirectedGraphNode neighborNode = cloneHelper(neighbor, visited);
                visited.put(neighbor.label, neighborNode);
            }
            retNode.neighbors.add(visited.get(neighbor.label));
        }
        return retNode;
        
        
    }
}