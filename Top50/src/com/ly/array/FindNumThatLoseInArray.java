package com.ly.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @ Author     ：ThunderFAR.
 * @ Date       ：Created in @create: 2018-10-02 23:02
 * @ Description：给定一个 1-n 的整数数组，请找到其中缺少的数字。
 * @ Modified By：
 * @Version: V1.0
 */

public class FindNumThatLoseInArray {
    //ThunderFar原生代码
    public static List<Integer> findNumThatLoseInArray(int[] num,int key){
        int[] array = new int[key];
        for (int i=0;i<num.length;i++){
            array[num[i]-1]++;
        }
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<array.length;i++){
            if(array[i]==0){
                list.add(i+1);
            }
        }
        return list;
    }

    //参考地址https://javarevisited.blogspot.com/2014/11/how-to-find-missing-number-on-integer-array-java.html



    //测试
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,5,1};
        List<Integer> num = findNumThatLoseInArray(new int[]{1, 2, 3, 4, 9, 8}, 10);
        for(Integer a:num){
            System.out.println(a);
        }

    }
}