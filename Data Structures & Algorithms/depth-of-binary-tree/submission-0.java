/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public int maxDepth(TreeNode root) {
        // int max_DepthLeft =0;
        // int max_DepthRight =0;

        if(root ==null){
            return 0;
        }

        int left = maxDepth(root.left);
        // max_DepthLeft++;
        int right = maxDepth(root.right);
        // max_DepthRight++;

        return Math.max(right, left)+1;
    }
}
