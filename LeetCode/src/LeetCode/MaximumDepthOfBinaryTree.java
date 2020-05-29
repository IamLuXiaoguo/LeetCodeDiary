package LeetCode; /**
 * @Author: Coder13
 * @Date: 2020/5/21 8:21
 * @description:
 * 97. 二叉树的最大深度
 * 中文English
 * 给定一个二叉树，找出其最大深度。
 * 二叉树的深度为根节点到最远叶子节点的距离。
 */

/**
 * Definition of LeetCode.TreeNode:
 * public class LeetCode.TreeNode {
 *     public int val;
 *     public LeetCode.TreeNode left, right;
 *     public LeetCode.TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 */
public class MaximumDepthOfBinaryTree {
    /**
     * @param root: The root of binary tree.
     * @return: An integer
     */
    public int maxDepth(TreeNode root) {
        // write your code here
        if(root==null) return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        //DFS遍历到最底层才开始进行树的高度的增加
        return Math.max(left,right)+1;
    }
}
