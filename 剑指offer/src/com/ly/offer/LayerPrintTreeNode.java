package com.ly.offer;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @ Author     ：ThunderFAR.
 * @ Date       ：Created in @create: 2018-10-03 20:43
 * @ Description：从上往下打印二叉树:从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 * @ Modified By：
 * @Version: V1.0
 */

public class LayerPrintTreeNode {
    public List<Integer> printFromTopToBottom(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            TreeNode curr=queue.poll();
            list.add(curr.val);
            if(curr.left!=null){
                queue.offer(curr.left);
            }else if(curr.right!=null){
                queue.offer(curr.right);
            }
        }
        return list;
    }

    }