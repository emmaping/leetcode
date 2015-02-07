/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    private int pLength;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int iLength = inorder.length ;
        pLength = postorder.length - 1;
        return helper(inorder, postorder, 0, iLength-1);
    }
    
    public TreeNode helper(int[] inorder, int[] postorder, int inStart, int inEnd){
        if (inStart > inEnd || pLength < 0) return null;
        int last = postorder[pLength--];
        TreeNode root = new TreeNode(last);
        for (int i = inStart; i<= inEnd; i++){
            if (last == inorder[i]){
                root.right = helper(inorder, postorder, i+1, inEnd);
                root.left = helper(inorder, postorder, inStart, i-1);
                break;
            }
        }
        return root;
    }
}