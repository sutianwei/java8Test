package 剑指offerAll;


/***
 * 请实现一个函数，用来判断一棵二叉树是不是对称的。如果一棵二叉树和它的镜像一样，那么它是对称的。
 *
 * 例如，二叉树 [1,2,2,3,4,4,3] 是对称的。
 *
 *     1
 *    / \
 *   2   2
 *  / \ / \
 * 3  4 4  3
 * 但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的:
 *
 *     1
 *    / \
 *   2   2
 *    \   \
 *    3    3
 *
 *
 */


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class 对称的二叉树 {

    /**
     * 对称二叉树定义： 对于树中 任意两个对称节点 LL 和 RR ，一定有：
     * L.val = R.valL.val=R.val ：即此两对称节点值相等。
     * L.left.val = R.right.valL.left.val=R.right.val ：即 LL 的 左子节点 和 RR 的 右子节点 对称；
     * L.right.val = R.left.valL.right.val=R.left.val ：即 LL 的 右子节点 和 RR 的 左子节点 对称
     */
    public boolean isSymmetric(TreeNode root) {

        return root == null ? true : recur(root.left, root.right);
    }

    boolean recur(TreeNode L,TreeNode R){
        if (L == null  && R == null ){
            return  true;
        }
        if (L == null || R == null || L.val !=R.val)  {
            return  false;
        }
        return recur(L.left,R.right)&& recur(L.right,R.left);

    }
}
