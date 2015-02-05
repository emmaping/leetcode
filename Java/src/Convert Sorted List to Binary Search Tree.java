/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
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
    private ListNode node;
    public TreeNode sortedListToBST(ListNode head) {
        int length = 0;
        if (head == null) return null;
        ListNode cur = head;
        node = head;
        while (cur != null){
            length++ ;
            cur = cur.next;
        }
        return helper(0, length-1);
    }
    private TreeNode helper(int start, int end){
        if (start > end) return null;
        int mid = (start+end)/2;
        TreeNode left = helper(start, mid-1);
        TreeNode root = new TreeNode(node.val);
        root.left = left;
        node = node.next;
        TreeNode right = helper(mid+1, end);
        root.right = right;
        return root;
    }
}