package 剑指offer.easyLevel;


public class 二叉树镜像 {
    public void Mirror(TreeNode root) {
        if (root == null || root.left == null && root.right == null) {
            return;
        }
        TreeNode tem = root.left;
        root.left = root.right;
        root.right = tem;
        if (root.left != null) Mirror(root.left);
        if (root.right != null) Mirror(root.right);
    }
}
