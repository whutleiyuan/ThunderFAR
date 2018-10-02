package com.ly.offer;

/**
 * @ Author     ：ThunderFAR.
 * @ Date       ：Created in @create: 2018-09-30 13:48
 * @ Description：矩形覆盖
 * @ Modified By：
 * @Version: 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 */

public class RectCover {
    public static int rectCover(int n){
        if (n==0){return 0;}
        if(n==1){return 1;}
        if(n==2){return 2;}
        return rectCover(n-1)+rectCover(n-2);
    }
}