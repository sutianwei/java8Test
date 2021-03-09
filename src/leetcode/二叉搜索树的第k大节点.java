package leetcode;


import sun.reflect.generics.tree.Tree;

public class 二叉搜索树的第k大节点 {
    /**
     * 因为二叉搜索树，左<中<右，所以先遍历右，中，左，得到的就是递减的数组，
     *
     * @param root
     * @param k
     * @return
     */



    int res, k;
    public int kthLargest(TreeNode root, int k) {
        this.k = k;
        dfs(root);
        return res;
    }
    void dfs(TreeNode root) {
        if(root == null) return;
        dfs(root.right);
        if(k == 0) return;
        if(--k == 0) res = root.val;
        dfs(root.left);
    }


}
