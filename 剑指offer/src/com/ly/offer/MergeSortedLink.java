package com.ly.offer;

/**
 * @ Author     ：ThunderFAR.
 * @ Date       ：Created in @create: 2018-10-02 22:48
 * @ Description：合并两个有序的链表
 * @ Modified By：
 * @Version: 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 */

public class MergeSortedLink {
    public ListNode Merge(ListNode list1,ListNode list2) {
        if(list1==null){
            return list2;
        }
        if(list2==null){
            return list1;
        }
        ListNode head;
        ListNode curr;
        if(list1.val<=list2.val){
            head=list1;
            curr=list1;
            list1=list1.next;
        }else {
            head=list2;
            curr=list2;
            list2=list2.next;
        }

        while(list1!=null&&list2!=null){
            if(list1.val<=list2.val){
                curr.next=list1;
                curr=curr.next;
                list1=list1.next;
            }else {
                curr.next=list2;
                curr=curr.next;
                list2=list2.next;
            }
        }

        //当还有剩余时
        if(list1!=null){
            curr.next=list1;
        }
        if(list2!=null){
            curr.next=list2;
        }
        return head;
    }
}