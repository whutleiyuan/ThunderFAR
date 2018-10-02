package com.ly.offer;

/**
 * @ Author     ：ThunderFAR.
 * @ Date       ：Created in @create: 2018-09-30 13:53
 * @ Description：数值的整数次方
 * @ Modified By：
 * @Version: 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 */

public class IntegerPowN {
    public double Power(double base, int exponent) throws Exception {
        double result=1.0;
        for (int i=0;i<Math.abs(exponent);i++){
            result *=base;
        }
        if (exponent>=0){
            return result;
        }else {
            return 1/result;
        }
    }
}