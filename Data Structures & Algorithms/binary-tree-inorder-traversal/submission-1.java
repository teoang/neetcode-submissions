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
    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> array = new ArrayList<>();
        
        Helper(root, array);

        return array;
    }

    public void Helper(TreeNode root, List array) {

        if (root == null) {
            return;
        }

        Helper(root.left, array);
        array.add(root.val);
        Helper(root.right, array);

        return;
    }
}