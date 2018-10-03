package com.ly.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ Author     ：ThunderFAR.
 * @ Date       ：Created in @create: 2018-10-03 08:13
 * @ Description：在给定的成对整数数组中，请找出所有总和等于给定数字的组合。
 * @ Modified By：
 * @Version: V1.0
 */

public class FindAllNumThatEqualsSum {
    public static void main(String[] args) {
        /*int[] numsners = {2, 4, 3, 5, 7, 8, 9};
        int[] numbersWithDuplicates = {2, 4, 3, 5, 6, -2, 4, 7, 8, 9};
        printPairs1(numsners, 7);
        printPairs1(numbersWithDuplicates, 7);*/
        printPairs2( new int[]{ 12, 14, 17, 15, 19, 20, -11}, 9);
        printPairs2( new int[]{ 2, 4, 7, 5, 9, 10, -1}, 9);
    }

    public static void printPairs1(int[] array, int sum) {
        for (int i = 0; i < array.length; i++) {
            int first = array[i];
            for (int j = i + 1; j < array.length; j++) {
                int second = array[j];
                if (first + second == sum) {
                    System.out.println("(" + first + "," + second + ")");
                }
            }
        }
    }

    //双指针
    public static void printPairs2(int[] array, int sum) {
        if(array.length<2){
            return;
        }
        Arrays.sort(array);
        int left=0;
        int right=array.length-1;
        while(left<right){
            int result=array[left]+array[right];
            if(result==sum){
                System.out.println("(" + array[left] + "," + array[right] + ")");
                left=left+1;
                right=right-1;
            }else if(result<sum){
                left++;
            }else if (result>sum){
                right--;
            }
        }
    }
}