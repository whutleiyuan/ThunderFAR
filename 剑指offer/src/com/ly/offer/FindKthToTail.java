package com.ly.offer;

/**
 * @ Author     ：ThunderFAR.
 * @ Date       ：Created in @create: 2018-10-02 22:22
 * @ Description：链表中倒数第K个结点
 * @ Modified By：
 * @Version: 输入一个链表，输出该链表中倒数第k个结点。
 */
public class FindKthToTail {
    public ListNode findKthToTail(ListNode head,int k){
        if(k==0||head==null){
            return null;
        }

        ListNode first=head;
        ListNode second=head;
        for(int i=0;i<k-1;i++){
            second=second.next;
            if(second==null){
                return null;
            }
        }

        while (second.next!=null){
            first=first.next;
            second=second.next;
        }
        return first;
    }
}