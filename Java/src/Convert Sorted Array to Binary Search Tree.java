 public class Solution {
        public TreeNode sortedArrayToBST(int[] num) {
            return helper(num,0,num.length-1);
        }
        private TreeNode helper(int[] num, int start,int end)
        {
            if(start>end) return null;
            int middle = (start+end)/2;
            TreeNode node = new TreeNode(num[middle]);
            node.left = helper(num,start,middle-1);
            node.right = helper(num,middle+1,end);
            return node;
        }
}