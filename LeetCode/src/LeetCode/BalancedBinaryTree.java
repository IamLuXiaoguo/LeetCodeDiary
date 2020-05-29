package LeetCode; /**
 * @Author: Coder13
 * @Date: 2020/5/20 21:08
 * @description:
 * 93. 平衡二叉树
 * 给定一个二叉树,确定它是高度平衡的。对于这个问题,一棵高度平衡的二叉树的定义是：一棵二叉树中每个节点的两个子树的深度相差不会超过1。
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
public class BalancedBinaryTree {
    /**
     * @param root: The root of binary tree.
     * @return: True if this Binary tree is Balanced, or false.
     */
    public boolean isBalanced(TreeNode root) {
        return maxDepth(root) != -1;
    }
    private int maxDepth(TreeNode root){
        if(root==null) return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        //告诉根节点，子树已经失衡了
        if(left==-1||right==-1||Math.abs(left-right)>1 ){
            return -1;
        }
        return Math.max(left,right)+1;
    }
}
