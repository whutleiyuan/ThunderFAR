package com.ly.offer;

/**
 * @ Author     ：ThunderFAR.
 * @ Date       ：Created in @create: 2018-09-27 11:36
 * @ Description：斐波那契数列
 * @ Modified By：
 * @Version: 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。 n<=39
 */

public class FibonacciSequence {
    public int Fibonacci(int n) {
        int f1=0;
        int f2=1;
        int sum=0;
        for(int i=0;i<n;i++){
            sum=f1+f2;
            f1=f2;
            f2=sum;
        }
        return sum;
    }
}