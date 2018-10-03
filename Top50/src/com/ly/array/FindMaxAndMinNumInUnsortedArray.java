package com.ly.array;

import java.util.List;

/**
 * @ Author     ：ThunderFAR.
 * @ Date       ：Created in @create: 2018-10-02 23:40
 * @ Description：如何在未排序的整数数组中找到最大值与最小值？
 * @ Modified By：
 * @Version: V1.0
 */

public class FindMaxAndMinNumInUnsortedArray {
    public static int[] findMaxAndMinNumInUnsortedArray(int[] array){
        //以第一个数为哨兵数，循环依次比较，如比最大数大则赋值给最大变量，如比最小值小则赋值给最小值
        int minNum=array[0];
        int maxNum=array[0];
        for(int i=1;i<array.length;i++){
            if(array[i]>maxNum){
                maxNum=array[i];
            }
            if (array[i]<minNum){
                minNum=array[i];
            }
        }
        int[] maxAndMin=new int[2];
        maxAndMin[0]=minNum;
        maxAndMin[1]=maxNum;
        return maxAndMin;
    }

    //测试
    public static void main(String[] args) {
        int[] array={1,2,3,5,3,89,34,56,78,36};
        int[] testNum = findMaxAndMinNumInUnsortedArray(array);
        for(int aa:testNum){
            System.out.println(aa);
        }
    }
}