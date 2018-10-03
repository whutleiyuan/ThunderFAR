package com.ly.offer;

/**
 * @ Author     ：ThunderFAR.
 * @ Date       ：Created in @create: 2018-10-02 22:57
 * @ Description：树的子结构
 * @ Modified By：
 * @Version: 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 */

public class HasSubtree {
    public static boolean hasSubtree(TreeNode root1, TreeNode root2) {
        if (root1 == null) {
            return false;
        }
        if (root2 == null) {
            return false;
        }
        if (root1.val == root2.val) {
            if (root2.left == null && root2.right == null) {
                return true;
            }
            if ((root1.right != null && root1.left != null) && (root2.left != null && root2.right != null) && (root1.left.val == root2.left.val && root1.right.val == root2.right.val)) {
                return hasSubtree(root1.left, root2.left) && hasSubtree(root1.right, root2.right);
            } else if ((root1.left != null && root1.right == null) && (root2.left != null && root2.right == null) && (root1.left.val == root2.left.val)) {
                return hasSubtree(root1.left, root2.left);
            } else if ((root1.left == null && root1.right != null) && (root2.left == null && root2.right != null) && (root1.right.val == root2.right.val)) {
                return hasSubtree(root1.right, root2.right);
            } else {
                if (root1.left != null && root2.right != null) {
                    return hasSubtree(root1.left, root2) || hasSubtree(root1.right, root2);
                } else if (root1 != null && root1.right == null) {
                    return hasSubtree(root1.left, root2);
                } else if (root1.left == null && root1.right != null) {
                    return hasSubtree(root1.right, root2);
                } else {
                    return false;
                }
            }
        } else if (root1.left != null && root1.right == null) {
            return hasSubtree(root1.left, root2);
        } else if (root1.left == null && root1.right != null) {
            return hasSubtree(root1.right, root2);
        } else {
            return false;
        }
    }
}