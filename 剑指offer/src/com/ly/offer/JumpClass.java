package com.ly.offer;

/**
 * @ Author     ：ThunderFAR.
 * @ Date       ：Created in @create: 2018-09-30 13:43
 * @ Description：跳台阶
 * @ Modified By：
 * @Version: 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
 */

public class JumpClass {
    public static int jumpClass(int n){
        if(n==1){
            return 1;
        }
        if (n==2){
            return 2;
        }
        return jumpClass(n-1)+jumpClass(n-2);
    }
}