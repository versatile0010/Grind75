/**
        - https://leetcode.com/problems/invert-binary-tree/
        - o(h) ; h is a height of tree
        - easy
 */
class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return null;
        }
        TreeNode leftNode = root.left;
        TreeNode rightNode = root.right;
        root.left = invertTree(rightNode);
        root.right = invertTree(leftNode);
        return root;
    }
}
