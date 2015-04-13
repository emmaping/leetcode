public class Solution {
    public void connect(TreeLinkNode root) {
        while(root != null){
            TreeLinkNode dummy = new TreeLinkNode(0);
        	TreeLinkNode cur = dummy;
            while(root!=null){
                if(root.left != null) {
                    cur.next = root.left; cur = cur.next;
                }
                if(root.right != null) {
                    cur.next = root.right; cur = cur.next;
                }
                root = root.next;
            }
            root = dummy.next;
        }
    }
}