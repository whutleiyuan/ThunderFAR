package com.ly.offer;

/**
 * @ Author     ：ThunderFAR.
 * @ Date       ：Created in @create: 2018-09-30 13:51
 * @ Description：二进制中1的个数
 * @ Modified By：
 * @Version: 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 */

public class No1NumInBinaryNum {
    public int NumberOf1(int n) {
        int count=0;
        while(n!=0){
            count++;
            n=n&(n-1);
        }
        return count;
    }
}