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
    private int preCur = 0;
    private int pLength ;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int iLength = inorder.length ;
        pLength = preorder.length - 1;
        return helper(inorder, preorder, 0, iLength-1);
    }

    public TreeNode helper(int[] inorder, int[] preorder, int inStart, int inEnd){
        if (inStart > inEnd || preCur > pLength) return null;
        int first = preorder[preCur++];
        TreeNode root = new TreeNode(first);
        for (int i = inStart; i<= inEnd; i++){
            if (first == inorder[i]){
                root.left = helper(inorder, preorder, inStart, i-1);
                root.right = helper(inorder, preorder, i+1, inEnd);
                break;
            }
        }
        return root;
    }
}