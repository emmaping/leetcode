public class BSTIterator {
    Stack<TreeNode> stack = new Stack<>();

    public BSTIterator(TreeNode root) {
        while ( root != null){
            stack.push(root);
            root = root.left;
        }
        
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    /** @return the next smallest number */
    public int next() {
        TreeNode node = stack.pop();
        TreeNode r = node.right;
        while (r != null){
            stack.push(r);
            r = r.left;
        }
        return node.val;
    }
}