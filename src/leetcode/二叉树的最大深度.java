package leetcode;

/**
 * 给定一个二叉树，找出其最大深度。
 * <p>
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数
 */

/** 叶子节点指没有子节点的节点 */
public class 二叉树的最大深度 {

    /**
     * 如果我们知道了左子树和右子树的最大深度 ll 和 rr，那么该二叉树的最大深度即为
     * <p>
     * max(l,r)+1
     *
     * @param root
     * @return
     */
    public int maxDepth(TreeNode root) {

        // 深度优先
        if (root == null) {
            return 0;
        }
        int right = maxDepth(root.right);
        int left = maxDepth(root.left);
        int i = Math.max(left, right) + 1;
        return i;
    }

}
