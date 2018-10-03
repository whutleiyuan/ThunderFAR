package com.ly.offer;

/**
 * @ Author     ：ThunderFAR.
 * @ Date       ：Created in @create: 2018-10-02 22:44
 * @ Description：反转链表
 * @ Modified By：
 * @Version: 输入一个链表，反转链表后，输出新链表的表头。
 */

public class ReverseLink {
    //非递归写法
    public ListNode reverseList(ListNode head) {
        ListNode reHead=null;
        while(head!=null){
            ListNode curr=head.next;
            head.next=reHead;
            reHead=head;
            head=curr;
        }
        return reHead;
    }
}