package 剑指offer.easyLevel;
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
    public TreeNode(int val) {
        this.val = val;
    }

}

public class 二叉树的深度 {
    /*
     * 输入一棵二叉树的根结点，求该树的深度。从根结点到叶子点依次经过的结点（含根、叶结点）形成树的一条路径，最长路径的长度为树的深度。
     */
    public int TreeDepth(TreeNode root) {
        if (root == null)
            return 0;
        int result = depth(root);
        return result;
    }

    /*
     * k只记录当前层的深度
     */
    private int depth(TreeNode root) {
        if (root == null)
            return 0;
        // 树的深度为其左右子树深度+1
        return max(depth(root.left), depth(root.right))+1;
    }

    private int max(int a, int b) {
        return a > b ? a : b;
    }

}
