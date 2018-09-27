package com.ly.offer;

import java.util.ArrayList;

/**
 * @ Author     ：ThunderFAR.
 * @ Date       ：Created in @create: 2018-09-27 11:04
 * @ Description：从尾到头打印链表
 * @ Modified By：
 * @Version: 输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
 */
class ListNode{
    int val;
    ListNode next=null;
    ListNode(int val){
        this.val=val;
    }
}

public class PrintLinkFromTailToHead {
    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        //1.反转链表
        ListNode head=listNode;
        ListNode reHead=null;
        while (head!=null){
            ListNode curr=head.next;
            head.next=reHead;
            reHead=head;
            head.next=curr;
        }
        //2.打印链表
        ArrayList<Integer> list=new ArrayList<>();
        while (reHead!=null){
            list.add(reHead.val);
            reHead=reHead.next;
        }
        return list;
    }
}