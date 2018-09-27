package com.ly.offer;

import java.util.Stack;

/**
 * @ Author     ：ThunderFAR.
 * @ Date       ：Created in @create: 2018-09-27 11:25
 * @ Description：用连个栈实现队列
 * @ Modified By：
 * @Version: 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 */

public class ImplQueueUseTwoStack {
    Stack<Integer> stack1=new Stack<>();
    Stack<Integer> stack2=new Stack<>();
    public void push(int node){
        stack1.push(node);
    }
    public int pop(){
        if(stack1.empty()&&stack2.empty()){
            throw new RuntimeException("Queue IS eMPTY");
        }
        if(stack2.empty()){
            while (!(stack1.empty())){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}