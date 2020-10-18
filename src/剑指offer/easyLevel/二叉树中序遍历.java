package 剑指offer.easyLevel;


import com.su.com.Stack23;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class 二叉树中序遍历 {
    /**
     * 给定一个二叉树，返回它的中序 遍历。
     * 左子树 -》根节点-》右子树
     */

    public List<Integer> midConvert(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        midCon(root, res);
        return res;
    }

    public void midCon(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }

        midCon(root.left, res);
        res.add(root.val);
        midCon(root.right, res);

    }


    public List<Integer>   midTo(TreeNode root){
        List<Integer> res = new ArrayList<Integer>();
        Stack<TreeNode> stk = new Stack<>();
        while (root != null || !stk.isEmpty()) {
            while (root != null) {
                stk.push(root);
                root = root.left;
            }
            root = stk.pop();
            res.add(root.val);
            root = root.right;
        }
        return res;

    }

}
